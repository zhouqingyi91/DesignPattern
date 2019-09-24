package design.pattern2.adapter.dispatchservlet;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用者
 */
public class DispatchServlet {
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    public DispatchServlet() {
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch(Controller request) {
        HandlerAdapter ha = getHandler(request);
        ha.handle(request);
    }

    public HandlerAdapter getHandler(Controller controller) {
        for (HandlerAdapter ha : handlerAdapters) {
            if (ha.supports(controller))
                return ha;
        }
        return null;
    }
}
