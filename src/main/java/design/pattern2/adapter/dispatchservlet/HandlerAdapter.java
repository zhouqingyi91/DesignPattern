package design.pattern2.adapter.dispatchservlet;

/**
 * 适配器接口 - 将各种适配器的实现, 适配成, 对应的目标类
 */
public interface HandlerAdapter {
    boolean supports(Object handler);
    void handle(Object handler);
}

class HttpHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doRequest();
    }
}

class SimpleHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doRequest();
    }
}
