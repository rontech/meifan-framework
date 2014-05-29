/**
 * RONTECH CONFIDENTIAL
 * __________________
 *
 *  [2014] - SuZhou Rontech Co.,Ltd.(http://www.sz-rontech.com)
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of SuZhou Rontech Co.,Ltd. and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to SuZhou Rontech Co.,Ltd.
 * and its suppliers and may be covered by China and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from SuZhou Rontech Co.,Ltd..
 */
package com.meifannet.framework.auth

import reflect.{ ClassTag, classTag }
import play.api.mvc._
import play.api.mvc.Results._
import scala.concurrent.{ ExecutionContext, Future }

import jp.t2v.lab.play2.auth.AuthConfig
import jp.t2v.lab.play2.auth.AuthElement
import jp.t2v.lab.play2.auth.LoginLogout
import jp.t2v.lab.play2.auth.OptionalAuthElement
import jp.t2v.lab.play2.stackc.{RequestWithAttributes, RequestAttributeKey,     StackableController}


/**
 * trait for the authorization and authentication of salon user.
 *
 * @since 1.0
 * @see jp.t2v.lab.play2.auth.AuthConfig
 */
trait BaseAuthConfig extends AuthConfig {}

/*
trait BaseAuthElement extends AuthElement with AuthConfig {}

trait BaseLoginLogout extends LoginLogout with AuthConfig {}

trait BaseOptionalAuthElement extends OptionalAuthElement with AuthConfig {}
*/
