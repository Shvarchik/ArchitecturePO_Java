package Homework_1.inmemorymodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import Homework_1.modelelements.*;

public class ModelStore implements ModelChanger {

    public Collection <PoligonalModel> models;
    public Collection <Flash> flashes;
    public List <Scene> scenes;
    public Collection <Camera> cameras;
   
    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
        changeObservers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
        changeObservers.remove(o);
    }

    @Override
    public void NotifyChange() {
            for (ModelChangedObserver o : changeObservers){
                o.ApplyUpdateModel();
            }
    }

    public Scene getScene(int index) {
        return scenes.get(index);
    }

}
