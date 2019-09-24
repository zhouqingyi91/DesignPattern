package design.pattern2.adapter.dispatchservlet;

/**
 * 适配的目标接口
 */
public interface Controller {
}

class HttpController implements Controller {
    public void doRequest() {
        System.out.println("http....");
    }
}

class SimpleController implements Controller {
    public void doRequest() {
        System.out.println("simple....");
    }
}