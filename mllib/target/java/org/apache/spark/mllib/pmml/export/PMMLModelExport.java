package org.apache.spark.mllib.pmml.export;
  interface PMMLModelExport {
  /**
   * Holder of the exported model in PMML format
   * @return (undocumented)
   */
  public  org.dmg.pmml.PMML pmml () ;
  public  void setHeader (org.dmg.pmml.PMML pmml) ;
  // not preceding
  public  org.dmg.pmml.PMML getPmml () ;
}
