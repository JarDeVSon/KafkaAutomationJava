package user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter

public class User {

  @Builder.Default
  private String nome = null;

  @Builder.Default
  private String email = null;

  @Builder.Default
  private Integer age = 0;

  @Override
  public String toString() {
    return "{\"nome\":" + nome + "," +
            "\"email\":" + email + "," +
            "\"age\":" + age + "}";
  }
}
