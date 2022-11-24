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

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(Collection<PoligonalModel> models) {
        this.models = models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(Collection<Flash> flashes) {
        this.flashes = flashes;
    }

    public List<Scene> getScenes() {
        return scenes;
    }

    public void setScenes(List<Scene> scenes) {
        this.scenes = scenes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(Collection<Camera> cameras) {
        this.cameras = cameras;
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
