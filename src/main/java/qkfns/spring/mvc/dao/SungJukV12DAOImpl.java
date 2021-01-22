package qkfns.spring.mvc.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import qkfns.spring.mvc.vo.SungJukVO;

import java.util.List;

@Repository("sjdao12")
public class SungJukV12DAOImpl implements SungJukV12DAO {

    @Autowired
    private SqlSession sqlSession;

    // 넘겨받은 성적데이터를 sungjuk테이블에 저장
    public String insertSungJuk(SungJukVO sj) {
        String result = "성적데이터 처리중...?!?";

        int cnt = sqlSession.insert("sungjuk.insertSungJuk", sj);
        if (cnt > 0) result = "성적데이터 저장완료!";

        return result;
    }

    // 번호,이름,국어,영어,수학,등록일을 조회하고
    // 그 결과들을 ArrayList에 담아서 넘김
    public List<SungJukVO> selectSungJuk() {
        return sqlSession.selectList("sungjuk.selectList");
    }

    // 성적번호로 성적데이터를 조회하고
    // 그 결과를 SungJukVO에 담아서 넘김
    public SungJukVO selectOneSungJuk(String sjno) {
        return sqlSession.selectOne("sungjuk.selectOne", sjno);
    }

    // 수정할 성적데이터를 매개변수로 넘겨주면
    // sungjuk테이블에서 해당 데이터를 수정함
    public String updateSungJuk(SungJukVO sj) {
        String result = "성적데이터 수정처리중...?!?";

        int cnt = sqlSession.update("sungjuk.updateSungJuk", sj);
        if (cnt > 0) result = "성적데이터 수정완료!";

        return result;
    }

    // 삭제할 성적번호를 매개변수로 넘겨주면
    // sungjuk테이블에서 해당 데이터를 삭제함
    public String deleteSungJuk(int sjno) {
        String result = "성적데이터 삭제처리중...?!?";

        int cnt = sqlSession.delete("sungjuk.deleteSungJuk", sjno);
        if (cnt > 0) result = "성적데이터 삭제완료!";

        return result;
    }
}
