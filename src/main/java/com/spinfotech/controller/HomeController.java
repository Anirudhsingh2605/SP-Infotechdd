package com.spinfotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Home | SP Infotech");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us | SP Infotech");
        return "about";
    }

    @GetMapping("/services")
    public String services(Model model) {
        model.addAttribute("title", "Our Services | SP Infotech");
        return "services";
    }

    @GetMapping("/portfolio")
    public String portfolio(Model model) {
        model.addAttribute("title", "Portfolio | SP Infotech");
        return "portfolio";
    }

    @GetMapping("/pricing")
    public String pricing(Model model) {
        model.addAttribute("title", "Pricing | SP Infotech");
        return "pricing";
    }

    @GetMapping("/blog")
    public String blog(Model model) {
        model.addAttribute("title", "Blog | SP Infotech");
        return "blog";
    }

    @GetMapping("/careers")
    public String careers(Model model) {
        model.addAttribute("title", "Careers | SP Infotech");
        return "careers";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact Us | SP Infotech");
        return "contact";
    }

    @PostMapping("/contact")
    public String submitContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String subject,
            @RequestParam String message,
            RedirectAttributes redirectAttributes) {
        
        // Mock processing the contact form
        System.out.println("Contact form submitted by: " + name + " (" + email + ")");
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
        
        redirectAttributes.addFlashAttribute("successMessage", "Thank you for reaching out! We will get back to you shortly.");
        return "redirect:/contact";
    }

    @PostMapping("/subscribe")
    public String subscribeNewsletter(@RequestParam String email, RedirectAttributes redirectAttributes) {
        // Mock processing newsletter subscription
        System.out.println("Newsletter subscription: " + email);
        
        redirectAttributes.addFlashAttribute("newsletterSuccess", "Successfully subscribed to our newsletter!");
        return "redirect:/"; // Redirects to home for now, could be improved with JS/AJAX
    }
}
