package ownradio.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ownradio.annotation.DisplayName;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность для хранения информации о пользователе
 *
 * @author Alpenov Tanat
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User extends AbstractEntity {
	@DisplayName(key = "user.name")
	private String name;

}
