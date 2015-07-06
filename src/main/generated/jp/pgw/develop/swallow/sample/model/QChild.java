package jp.pgw.develop.swallow.sample.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QChild is a Querydsl query type for Child
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QChild extends EntityPathBase<Child<? extends Parent>> {

    private static final long serialVersionUID = -1621536765L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChild child = new QChild("child");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QParent parent;

    @SuppressWarnings("all")
    public QChild(String variable) {
        this((Class)Child.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QChild(Path<? extends Child> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QChild(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    @SuppressWarnings("all")
    public QChild(PathMetadata<?> metadata, PathInits inits) {
        this((Class)Child.class, metadata, inits);
    }

    public QChild(Class<? extends Child<? extends Parent>> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QParent(forProperty("parent")) : null;
    }

}

