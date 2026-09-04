import controller.HabilidadeController;
import view.HabilidadeView;

public class App {
    public static void main(String[] args) throws Exception {
        HabilidadeView view = new HabilidadeView();
        HabilidadeController controller = new HabilidadeController(view);
        view.setVisible(true);
    }
}
