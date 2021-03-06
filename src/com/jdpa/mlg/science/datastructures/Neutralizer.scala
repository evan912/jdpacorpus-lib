/**
 *  This code is distributed under the licensing terms of the JDPA Sentiment Corpus
 *  available at https://verbs.colorado.edu/jdpacorpus/JDPA-Sentiment-Corpus-Licence-ver-2009-12-17.pdf
 *
 *  To use this code be sure to sign and send in a license as described at
 *  http://verbs.colorado.edu/jdpacorpus
 * 
 *  The code is copyright J.D. Power and Associates and Gregory Ichneumon Brown, and
 *  is provided as is.
 * 
 * The Class Neutralizer represents an opinion that should be ignored in sentiment score
 * calculation.
 * <p>
 * Example: "<u>if this is a bad car</u> I'll return it"
 * 
 * @author      Gregory Ichneumon Brown
 * 
 * @todo implement transferSentiment
 */
package com.jdpa.mlg.science.datastructures

@scala.serializable
class Neutralizer extends Modifier {

  /**
   * Neutralize (zero-out) the sentiment on the targets and return
   *
   * @param target The Entity being targetted
   * @return Double
   */
  def transferSentiment(target: Entity): Double = {
    0
  }

}
