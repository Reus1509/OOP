public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void login(String password){
        String result = "Неверный пароль.";

        if(model.getPassword().equals(password)){
            result = "Правильный пароль!";
            view.hideInputField();
        }

        view.updateStatusLabel(result);
    }
}
