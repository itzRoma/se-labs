package com.lab111.labwork3.v1;

/**
 * Interface "Composite" extends the main interface "Component"
 * and declares "addComponent" and "removeComponent" methods.
 *
 * This interface describes parental components.
 *
 * @author Roma Bondarenko
 */
public interface Composite extends Component {
    void addComponent(Component component);
    void removeComponent();
}
