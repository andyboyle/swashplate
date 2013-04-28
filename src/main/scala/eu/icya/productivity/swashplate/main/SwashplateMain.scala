package eu.icya.productivity.swashplate.main

import org.slf4j.LoggerFactory;

object SwashplateMain {
  val logger = LoggerFactory.getLogger(SwashplateMain.getClass)

  def main (args: Array[String]) {
    startSwashplate
  }

  def startSwashplate {
    logger.info("Starting Swashplate ...")
  }
}
