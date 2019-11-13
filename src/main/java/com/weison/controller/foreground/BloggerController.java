package com.weison.controller.foreground;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.weison.entity.BlogType;
import com.weison.entity.Blogger;
import com.weison.service.BlogService;
import com.weison.service.BlogTypeService;
import com.weison.service.BloggerService;
import com.weison.util.CryptographyUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * Blogger Controller
 * @author thales
 *
 */
@Controller
@RequestMapping("/blogger")
public class BloggerController {

    @Resource
    private BloggerService bloggerService;
    @Resource
    private BlogTypeService blogTypeService;
    @Resource
    private BlogService blogService;

    /**
     * 博主后台登录验证
     * @param blogger 登录信息
     * @param request 请求参数
     * @return 视图名
     */
    @RequestMapping("/login")
    public String login(Blogger blogger, HttpServletRequest request) {

        Subject subject = SecurityUtils.getSubject();
        String newPassword = CryptographyUtil.md5(blogger.getPassword(), "javacoder");

        UsernamePasswordToken token = new UsernamePasswordToken(blogger.getUsername(), "root");
        System.out.println(blogger.getUsername()+":"+blogger.getPassword()+",new password:" + newPassword);
        try {
            subject.login(token);
            return "redirect:/admin/blogger/main.html";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            //将请求返还给登录页面
            request.setAttribute("bloger", blogger);
            request.setAttribute("errorInfo", "密码错误");
            return "login";
        }

    }

    /**
     *关于博主页面
     * @return 视图和模型
     */
    @RequestMapping("/aboutme")
    public ModelAndView abouotMe() {

        ModelAndView modelAndView = new ModelAndView();


        List<BlogType> blogTypeList = blogTypeService.getBlogTypeData();
        modelAndView.addObject("blogTypeList",blogTypeList);

        List<Map<String, Object>> blogTimeList = blogService.getBlogData();
        modelAndView.addObject("blogTimeList",blogTimeList);

        Blogger blogger = bloggerService.getBloggerData();
        modelAndView.addObject("blogger", blogger);
        modelAndView.addObject("commonPage", "foreground/blogger/bloggerInfo.jsp");
        modelAndView.addObject("title", "你猜");
        modelAndView.setViewName("/mainTemp");
        return modelAndView;
    }

    /**
     *简历页面
     * @return 视图和模型
     */
    @RequestMapping("/myalbum")
    public ModelAndView myAlbum() {
        ModelAndView modelAndView = new ModelAndView();

        Blogger blogger = bloggerService.getBloggerData();
        modelAndView.addObject("blogger",blogger);

        List<BlogType> blogTypeList = blogTypeService.getBlogTypeData();
        modelAndView.addObject("blogTypeList",blogTypeList);

        List<Map<String, Object>> blogTimeList = blogService.getBlogData();
        modelAndView.addObject("blogTimeList",blogTimeList);

        modelAndView.addObject("commonPage", "foreground/blogger/myAlbum.jsp");
        modelAndView.setViewName("/mainTemp");
        return modelAndView;
    }

    /**
     * 资源页面
     * @return 视图和模型
     */
    @RequestMapping("/resource")
    public ModelAndView resource() {
        ModelAndView modelAndView = new ModelAndView();

        Blogger blogger = bloggerService.getBloggerData();
        modelAndView.addObject("blogger",blogger);

        List<BlogType> blogTypeList = blogTypeService.getBlogTypeData();
        modelAndView.addObject("blogTypeList",blogTypeList);

        List<Map<String, Object>> blogTimeList = blogService.getBlogData();
        modelAndView.addObject("blogTimeList",blogTimeList);

        modelAndView.addObject("commonPage", "foreground/blogger/resource.jsp");
        modelAndView.setViewName("/mainTemp");
        return modelAndView;
    }
    public static void main(String[] args){
        System.out.println(CryptographyUtil.md5("jzh", "javacoder"));
    }
}
