package qkfns.spring.mvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import qkfns.spring.mvc.service.MemberService;
import qkfns.spring.mvc.vo.MemberVO;

@Controller
public class MemberController {

    @Autowired
    private MemberService msrv04;

    @GetMapping("/member")
    public String member() {
        return "member";
    }

    @PostMapping("/memberok")
    public ModelAndView memberok(MemberVO mvo) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("memberok");
        mv.addObject("result",msrv04.newMember(mvo));
        mv.addObject("mvo",mvo);

        return mv;
    }

    @GetMapping("/memberlist")
    public ModelAndView memberlist() {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("memberlist"); // /WEB-INF/jsp/memberlist.jsp
        mv.addObject("mvos", msrv04.readMember());

        return mv;
    }
    @GetMapping("/memberview")
    public ModelAndView memberview(String userid) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("memberview");
        mv.addObject("m",msrv04.readOneMember(userid));

        return mv;
    }
    @GetMapping("/memberdel")
    public String memberdel(String name){

        System.out.println(msrv04.removeMember(name));
        // 이름으로 회원정보 삭제

        return "redirect:/memberlist";
    }

    @GetMapping("/memberupd")
    public ModelAndView memberupd(String userid){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("memberupd");
        mv.addObject("mvo",msrv04.readOneMember(userid));

        return mv;
    }

    @PostMapping("/memberupdok")
    public String memberupdok(MemberVO mvo){

        msrv04.modifyMember(mvo);

        return "redirect:/memberlist";
    }
}
