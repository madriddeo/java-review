import lombok.*;


//@NoArgsConstructor
@AllArgsConstructor //(AccessLevel.PRIVATE)
@Data
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
public class Student {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private int age;


}
