/**
 * Q6: 次のフォームデータに対するバリデーションルールを満たすように、UserFormクラスを完成させてくだ
さい。
username は必須入力で、3文字以上10文字以下
email は有効なメールアドレス形式
age は18歳以上
 */
package com.example.demo.form;

/**
 * 
 */
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserForm {

    @NotBlank(message = "ユーザー名は必須です")
    @Size(min = 3, max = 10, message = "ユーザー名は3文字以上10文字以下で入力してください")
    private String username;

    @NotBlank(message = "メールアドレスは必須です")
    @Email(message = "有効なメールアドレスを入力してください")
    private String email;

    @Min(value = 18, message = "年齢は18歳以上でなければなりません")
    private int age;

    // GetterとSetter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
