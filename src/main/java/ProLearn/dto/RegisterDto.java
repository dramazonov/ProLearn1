package ProLearn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {

    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDateTime birthDate;
    private String nickName;
    @Pattern(regexp = "^[+][9][9][0-9]{9}")
    private String phoneNumber;
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",
            message = "Faqat lotin alifbosi harflari ishlatilishi kerak\n" +
                    "Kamida bitta katta harf bo`lishi kerak\n" +
                    "Kamida bitta kichik harf bo'lishi kerak\n" +
                    "Kamida bitta maxsus belgi ishlatilishi kerak\n" +
                    "Kamida bitta raqam bo'lishi kerak")
    private String password;
}
