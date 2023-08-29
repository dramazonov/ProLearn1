package ProLearn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {
    private String nickName;
    @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-_]).{8,}$",
    message = "Faqat lotin alifbosi harflari ishlatilishi kerak\n" +
            "Kamida bitta katta harf bo`lishi kerak\n" +
            "Kamida bitta kichik harf bo'lishi kerak\n" +
            "Kamida bitta maxsus belgi ishlatilishi kerak\n" +
            "Kamida bitta raqam bo'lishi kerak")
    private String password;
}
