package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;       // ✅ Add this
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestControll
public class GithubCicdApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to JavaTechie";
	}

//	echo "# github-actions-example" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/sachinrajput9810/github-actions-example.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdApplication.class, args);
	}

}
