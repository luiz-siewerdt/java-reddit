package io.github.shampooshrek.reddit.models.dto;

public class RegisterDto {

  private String name;
  private String nickname;
  private String email;
  private String password;
  private String confPassword;

  public RegisterDto(String name, String nickname, String email, String password, String confPassword) {
    this.name = name;
    this.nickname = nickname;
    this.email = email;
    this.password = password;
    this.confPassword = confPassword;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getConfPassword() {
    return confPassword;
  }

  public void setConfPassword(String confPassword) {
    this.confPassword = confPassword;
  }

}
