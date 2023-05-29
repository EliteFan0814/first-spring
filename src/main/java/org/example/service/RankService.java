package org.example.service;

import org.example.anno.Cache;
import org.example.dao.RankDao;
import org.example.dao.UserMapper;
import org.example.entity.RankItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    RankDao rankDao;
    @Cache
    public List<RankItem> getRank(){
        return rankDao.getRank();
    }
}
