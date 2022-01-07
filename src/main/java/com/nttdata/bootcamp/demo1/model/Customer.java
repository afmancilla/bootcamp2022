package com.nttdata.bootcamp.demo1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * [Description]. <br/>
 * <b>Class</b>: {@link Customer}<br/>
 * <b>Copyright</b>: &Copy; 2021 Everis Per&uacute;. <br/>
 * <b>Company</b>: Everis del Per&uacute;. <br/>
 *
 * @author Everis Per&uacute;. (EVE) <br/>
 * <u>Developed by</u>: <br/>
 * <ul>
 * <li>{USERNAME}. (acronym) From (EVE)</li>
 * </ul>
 * <u>Changes</u>:<br/>
 * <ul>
 * <li>sep. 15, 2021 (acronym) Creation class.</li>
 * </ul>
 * @version 1.0
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Customer {

  private String id;
  private String firstname;
  private String lastname;
  private String email;

}
