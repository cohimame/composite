package controllers

import play.api._
import play.api.mvc._

import easy.Messages._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index(s"from other module: $demo"))
  }
  
}