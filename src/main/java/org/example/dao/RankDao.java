package org.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.entity.RankItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankDao {
    @Autowired
    private SqlSession sqlSession;
    public List<RankItem> getRank() {
        return sqlSession.selectList("MyMapper1.selectRank");
    }
}
