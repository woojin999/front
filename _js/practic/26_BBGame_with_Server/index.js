let listChk = "N";

async function registerItemToServer(itemObj) {
    try {
        const url = 'http://dldnwls789.dothome.co.kr/api/items/create';
        const config = {
            method: 'POST',
            headers: {
                'Accept':'application/json',
                'Content-Type':'application/x-www-form-urlencoded'
            },
            body: JSON.stringify(itemObj)
        };
        const resp = await fetch(url, config);
        const result = await resp.json();
        return await result;
    } catch (error) {
        console.log(error);
        
    };
};
async function getItemViewFromServer(ino) {
    try {
      const resp = await fetch("http://dldnwls789.dothome.co.kr/api/items/read/"+ino);
      const respText = await resp.text();
      const itemObj = await JSON.parse(respText);
      return await itemObj;
    } catch (error) {
      console.log(error);
    }
  };
  
async function getItemListFromServer() { 
  try {
        const url = "http://dldnwls789.dothome.co.kr/api/items/read"; 
        const resp = await fetch(url); 
        const respText = await resp.text(); 
        const itemsObj = await JSON.parse(respText); 
        return await itemsObj; 
      } catch (error) {
          console.log(error);
      }
};

async function deleteItemOfServer(ino){ 
    try {
        const url = 'http://dldnwls789.dothome.co.kr/api/items/delete';
        const config = {
            method: 'POST',
            headers: {
                'Accept':'application/json',
                'Content-Type':'application/x-www-form-urlencoded'
            },
            body: JSON.stringify({id:ino})
        };
        const resp = await fetch(url, config);
        const result = await resp.json();
        return await result;
    } catch (error) {
        console.log(error);
    }
}

document.getElementById('tryBtn').addEventListener('click', (e) => {
    e.preventDefault();
    if (result == "Y") {
        let itemObj = {};
        itemObj.name = document.getElementById('myname').value;
        
        let comNumbers = `${comNums[0]}${comNums[1]}${comNums[2]}`;
        itemObj.description = comNumbers

        let time = `${gameHistory[gameHistory.length-1].gap}`
        itemObj.price = time
        
        let counts = `${gameHistory[gameHistory.length-1].tries}`
        itemObj.category_id = counts

        const now = new Date();
        let createNow = `${now.getFullYear()}-${now.getMonth()+1}-${now.getDate()} ${now.getHours()}:${now.getMinutes()}:${now.getSeconds()}`;
        itemObj.created = createNow;

        registerItemToServer(itemObj).then(result => {
            console.log(result);

            if (listChk == "Y") {
                document.getElementById('historyBtn').click();
            }
        }
        );

        
    }

    result = "N";
});

function printItemList(itemArr) {
    let str = ``;
    itemArr.forEach(itemObj => {
       str += `<div class="cl">
       <div class="card">
         <div class="card-body">
           <p class="card-text">User name : ${itemObj.name}</p>
           <div class="d-flex">
             <div class="btn-group">
               <button type="button" data-ino="${itemObj.id}" class="detailbtn">기록 상세 보기</button>
               <button type="button" data-ino="${itemObj.id}" class="delbtn">기록 삭제</button>
             </div>
             
           </div>
         </div>
       </div>
     </div>`;
    });
    document.getElementById('itemListArea').innerHTML= str;
};

function printItemObject(item) { 
    let str = `
    
    <h2 class="pb-2">상세 기록</h2>
  <div class="row1">
    <div class="col1">
      <div>
        <h4 class="fw">User ID</h4>
        <p>${item.id}</p>
      </div>
    </div>
    <div class="col2">
      <div>
        <h4 class="fw">User Name</h4>
        <p>${item.name}</p>
      </div>
    </div>
    <div class="col3">
      <div>
        <h4 class="fw">정답</h4>
        <p>${item.description}</p>
      </div>
    </div>
    <div class="col4">
      <div>
        <h4 class="fw">게임 소요 시간</h4>
        <p>${item.price}초</p>
      </div>
    </div>
    <div class="col5">
      <div>
        <h4 class="fw">시도 횟수</h4>
        <p>${item.category_id}회</p>
      </div>
    </div>
    <div class="col6">
      <div>
        <h4 class="fw">게임 종료 시간</h4>
        <p>${item.created}</p>
      </div>
    </div>
   
  </div>
  `;
  document.getElementById('detail_list').innerHTML = str;
};

document.getElementById('historyBtn').addEventListener('click', (e)=> {
    listChk =  "Y";

    e.preventDefault();
    getItemListFromServer().then(result => {
        console.log(result.items);
        printItemList(result.items);
    });
});

document.addEventListener('click', (e) => {
  if(e.target.classList.contains('detailbtn')){
    getItemViewFromServer(e.target.dataset.ino).then(result=>{
      console.log(result.items[0]);
      printItemObject(result.items[0]);
    });
  } else if (e.target.classList.contains('delbtn')) { 
        e.preventDefault();

        deleteItemOfServer(e.target.dataset.ino).then(result =>{
            console.log(result);
            alert('기록이 삭제 되었습니다.');
            
            document.getElementById('historyBtn').click();
        });
    }
});  











