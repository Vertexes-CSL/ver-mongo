package ddprofiler.analysis;

import ddprofiler.analysis.modules.Entities;

/**
 * @author Raul - raulcf@csail.mit.edu
 */
public interface TextualAnalysis extends Analysis, TextualDataConsumer {

//    public Entities getEntities();

    public long[] getMH();

    public String getLabel();

}
