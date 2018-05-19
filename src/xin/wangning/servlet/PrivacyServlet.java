package xin.wangning.servlet;

import cn.itcast.commons.CommonUtils;
import cn.itcast.servlet.BaseServlet;
import xin.wangning.domain.Privacy;
import xin.wangning.service.PrivacyService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PrivacyServlet extends BaseServlet {
    private PrivacyService privacyService = new PrivacyService();
    public String add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Privacy privacy = CommonUtils.toBean(request.getParameterMap(),Privacy.class);
        privacy.setUuid(CommonUtils.uuid());
        privacyService.add(privacy);
        request.setAttribute("msg","信息记录成功！");
        return "f:./msg.jsp";
    }
    public String findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("privacyList",privacyService.findAll());
        return "f:./list.jsp";
    }

}
