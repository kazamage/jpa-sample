package jp.pgw.develop.swallow.sample.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QParent is a Querydsl query type for Parent
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QParent extends EntityPathBase<Parent<? extends Child>> {

    private static final long serialVersionUID = 1637943971L;

    public static final QParent parent = new QParent("parent");

    public final ListPath<Child<?>, QChild> children = this.<Child<?>, QChild>createList("children", Child.class, QChild.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    @SuppressWarnings("all")
    public QParent(String variable) {
        super((Class)Parent.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QParent(Path<? extends Parent> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    @SuppressWarnings("all")
    public QParent(PathMetadata<?> metadata) {
        super((Class)Parent.class, metadata);
    }

}

