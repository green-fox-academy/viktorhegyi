import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by Viktor on 2017-04-28.
 */
public interface YodaService {

  @Headers({
      "X-Mashape-Key: 3oMx2v6KaymshfTIw1BJBdRdXwGxp1ac4xVjsn4mt366Lx1Yp6",
      "Accept: text/plain"
  })

  @GET("yoda")
  Call<ResponseBody> getAnswer (@Query("sentence") String input);

}
