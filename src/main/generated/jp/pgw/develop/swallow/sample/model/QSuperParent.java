package jp.pgw.develop.swallow.sample.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSuperParent is a Querydsl query type for SuperParent
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSuperParent extends EntityPathBase<SuperParent> {

    private static final long serialVersionUID = -382472788L;

    public static final QSuperParent superParent = new QSuperParent("superParent");

    public final QParent _super = new QParent(this);

    //inherited
    public final ListPath<Child<?>, QChild> children = _super.children;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    public QSuperParent(String variable) {
        super(SuperParent.class, forVariable(variable));
    }

    public QSuperParent(Path<? extends SuperParent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSuperParent(PathMetadata<?> metadata) {
        super(SuperParent.class, metadata);
    }

}

