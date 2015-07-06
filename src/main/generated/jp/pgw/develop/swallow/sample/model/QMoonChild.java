package jp.pgw.develop.swallow.sample.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMoonChild is a Querydsl query type for MoonChild
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMoonChild extends EntityPathBase<MoonChild> {

    private static final long serialVersionUID = -1822486014L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMoonChild moonChild = new QMoonChild("moonChild");

    public final QChild _super;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath name;

    // inherited
    public final QParent parent;

    public QMoonChild(String variable) {
        this(MoonChild.class, forVariable(variable), INITS);
    }

    public QMoonChild(Path<? extends MoonChild> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMoonChild(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMoonChild(PathMetadata<?> metadata, PathInits inits) {
        this(MoonChild.class, metadata, inits);
    }

    public QMoonChild(Class<? extends MoonChild> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QChild(type, metadata, inits);
        this.id = _super.id;
        this.name = _super.name;
        this.parent = _super.parent;
    }

}

