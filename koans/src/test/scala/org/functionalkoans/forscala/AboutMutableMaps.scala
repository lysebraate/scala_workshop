package org.functionalkoans.forscala

import support.KoanSuite
import scala.collection.mutable

class AboutMutableMaps extends KoanSuite {

  koan("Mutable maps can be created easily") {
    val myMap = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    myMap.size should be(__)
    myMap += "OR" -> "Oregon"
    myMap contains "OR" should be(__)
  }

  koan("Mutable maps can have elements removed") {
    val myMap = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    myMap -= "OH"
    myMap contains "OH" should be(__)
  }

}
