package design.pattern2.adapter.dispatchservlet;

public class Client {
    public static void main(String[] args) {
        HttpController httpController = new HttpController();
        SimpleController simpleController = new SimpleController();

        DispatchServlet dispatchServlet = new DispatchServlet();

        dispatchServlet.doDispatch(httpController);
        System.out.println("==========================");
        dispatchServlet.doDispatch(simpleController);
    }
}
