package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("repos")
public class IssueController {
    @RequestMapping("/search")
    public String search(@RequestParam("q") String searchKeyword) {
        return "你查询的字符是" + searchKeyword;
    }

    @DeleteMapping("/{owner}/{repo}/issues/{issueNumber}/lock")
    public void unlock(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @PathVariable("issueNumber") String issueNumber
    ) {
        System.out.println(owner);
        System.out.println(repo);
        System.out.println(issueNumber);
    }

    @PostMapping("/{owner}/{repo}/issues")
    public void create(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @RequestBody IssueParams issueParams
    ) {
        System.out.println(issueParams);
    }
    @PostMapping("/login")
    public void login(@RequestParam String user,@RequestParam String password){
        System.out.println(user);

    }
}
