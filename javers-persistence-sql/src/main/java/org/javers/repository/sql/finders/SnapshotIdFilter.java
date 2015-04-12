package org.javers.repository.sql.finders;

import org.javers.core.metamodel.object.GlobalId;

import static org.javers.repository.sql.schema.FixedSchemaFactory.SNAPSHOT_PK;

/**
 * Created by bartosz.walacik on 2015-04-12.
 */
class SnapshotIdFilter extends SnapshotFilter {
    final GlobalId globalId;

    SnapshotIdFilter(long snapshotId, GlobalId globalId) {
        super(snapshotId, SNAPSHOT_PK);
        this.globalId = globalId;
    }
}
