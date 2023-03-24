import Model
import Presenter
import View

model = Model.MinesweeperModel()
controller = Presenter.MinesweeperController(model);
view = View.MinesweeperView(model, controller)
view.pack()
view.mainloop()