package xin.wangning.service;

import xin.wangning.dao.PrivacyDao;
import xin.wangning.domain.Privacy;

import java.util.List;

public class PrivacyService {
    private PrivacyDao dao = new PrivacyDao();
    public List<Privacy> findAll(){
        return dao.findAll();
    }

    public void add(Privacy privacy){
        dao.add(privacy);
    }

}
