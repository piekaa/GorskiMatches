package pl.piekoszek.gorskimatches.token;

import org.springframework.web.bind.annotation.*;
import pl.piekoszek.gorskimatches.repository.AccountRepository;

@RestController
@RequestMapping("api")
class AccountController {

    private AccountRepository accountRepository;
    private EmailService emailService;

    AccountController(EmailService emailService, AccountRepository accountRepository) {
        this.emailService = emailService;
        this.accountRepository = accountRepository;
    }

    @PostMapping("email")
    void sendRegistrationEmail (@RequestBody AccountInfo accountInfo) {
        emailService.sendAccountActivationLink(accountInfo.getEmail());
    }

    @PostMapping("account")
    void changeAccountInfo(@RequestBody AccountInfo accountInfo) {
        accountRepository.save(accountInfo);
    }
}
