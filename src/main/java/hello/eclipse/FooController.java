package hello.eclipse;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/foo")
public class FooController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}