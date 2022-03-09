package com.shiroha.demo.Controller;

import com.shiroha.demo.Model.UserModel;
import com.shiroha.demo.Service.Impl.UserServiceImpl;
import com.shiroha.demo.Service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "hello world";
    }

    @RequestMapping("/xss")
    public String xss(@RequestParam("xss") String xss) {
        return "your input: " + xss;
    }

    @RequestMapping("/sql")
    public String sql(@RequestParam("name") String name) {
        UserService userService = new UserServiceImpl();
        UserModel user = userService.showByName(name);
        return user.toString();
    }

    @RequestMapping("/exec")
    public String exec(@RequestParam("ip") String ip) throws Exception{
        String cmd = ip;
        String result = cmd + "\n\n ";

        Process p = Runtime.getRuntime().exec(cmd);
        java.io.InputStream in = p.getInputStream();
        java.io.DataInputStream dis = new java.io.DataInputStream(in);

        for (String disr = dis.readLine(); disr != null; disr = dis.readLine()) {
            result = result + disr + "\n";
        }

        dis.close();
        in.close();
        return result;
    }

}
