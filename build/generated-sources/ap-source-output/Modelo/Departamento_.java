package Modelo;

import Modelo.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-02T18:18:53")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, Integer> idDep;
    public static volatile CollectionAttribute<Departamento, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Departamento, String> nombre;

}