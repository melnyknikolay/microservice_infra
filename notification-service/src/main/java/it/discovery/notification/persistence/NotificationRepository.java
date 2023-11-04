package it.discovery.notification.persistence;

import it.discovery.notification.domain.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
