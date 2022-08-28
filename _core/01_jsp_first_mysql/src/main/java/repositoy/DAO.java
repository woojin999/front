package repositoy;

import java.util.List;

import domain.ProductVO;

public interface DAO { // Data Access Object

	int insert(ProductVO pvo); 

	List<ProductVO> selectList();

	ProductVO selectOne(int pno);

	int update(ProductVO pvo);

	int delete(int pno);

}
