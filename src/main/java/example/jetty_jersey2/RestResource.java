
package example.jetty_jersey2;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 */
@Path("example")
public class RestResource {


    @GET
    @Path("text")
    @Produces("text/plain")
    public String getText() {
        return "Hello World";
    }

    @GET
    @Path("json")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getJson() {
        return Json.createObjectBuilder().add("hello", "world").build();
    }
    @GET
    @Path("json-bean/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Hoge getBean(@PathParam("name") String name) {
        return new Hoge(name, 10);
    }

    @POST
    @Path("json-post")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Hoge postBean(Hoge hoge) {
        hoge.setName(hoge.getName() + "!!");
        hoge.setNum(hoge.getNum() + 10);
        return hoge;
    }

    public static class Hoge{
        private String name;
        private int num;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public Hoge() {
        }

        public Hoge(String name, int num) {
            this.name = name;
            this.num = num;
        }
        

    }
}
