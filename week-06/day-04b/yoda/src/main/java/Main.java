import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 * Created by Viktor on 2017-04-28.
 */
public class Main {

  public static void main(String[] args) {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://yoda.p.mashape.com/")
        .build();

    YodaService YodaService = retrofit.create(YodaService.class);

    String input = "I am your fater, Luke.";
    Call<ResponseBody> yodaAnswer = YodaService.getAnswer(input);

    try {
      System.out.println(yodaAnswer.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
