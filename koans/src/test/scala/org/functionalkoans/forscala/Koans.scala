package org.functionalkoans.forscala

import org.scalatest._
import support.Master

class Koans extends Suite {
  override def nestedSuites = List(

    //==== PART ONE
    //Basic syntax and concepts
    new AboutAsserts,
    new AboutValAndVar,
    new AboutMutableMaps,
    new AboutObjects,
    new AboutMethods,
    new AboutHigherOrderFunctions,
    //new AboutByNameParameter,

    //==== PART TWO
    // Basic Datastructures
    new AboutTuples,
    new AboutLists,
    new AboutMaps,
    new AboutSets,
    new AboutCaseClasses,
    new AboutPatternMatching,

    //==== PART THREE
    new AboutIterables,
    new AboutTraversables,
    //new AboutPartialFunctions

    /*
    new AboutAsserts,
    new AboutValAndVar,
    new AboutClasses,
    new AboutOptions,
    new AboutObjects,
    new AboutTuples,
    new AboutHigherOrderFunctions,
    new AboutLists,
    new AboutMaps,
    new AboutSets,
    new AboutFormatting,
    new AboutPatternMatching,
    new AboutCaseClasses,
    new AboutRange,
    new AboutPartiallyAppliedFunctions,
    new AboutPartialFunctions,
    new AboutImplicits,
    new AboutTraits,
    new AboutForExpressions,
    new AboutInfixPrefixAndPostfixOperators,
    new AboutInfixTypes,
    new AboutMutableMaps,
    new AboutMutableSets,
    new AboutSequencesAndArrays,
    new AboutIterables,
    new AboutTraversables,
    new AboutNamedAndDefaultArguments,
    new AboutManifests,
    new AboutPreconditions,
    new AboutExtractors,
    new AboutByNameParameter,
    new AboutRepeatedParameters,
    new AboutParentClasses,
    new AboutEmptyValues,
    new AboutTypeSignatures,
    new AboutUniformAccessPrinciple,
    new AboutLiteralBooleans,
    new AboutLiteralNumbers,
    new AboutLiteralStrings,
    new AboutTypeVariance,
    new AboutEnumerations,
    new AboutConstructors
    */

  )

  override def run(testName: Option[String], reporter: Reporter, stopper: Stopper, filter: Filter,
                   configMap: Map[String, Any], distributor: Option[Distributor], tracker: Tracker) {
    super.run(testName, reporter, Master, filter, configMap, distributor, tracker)
  }

}
