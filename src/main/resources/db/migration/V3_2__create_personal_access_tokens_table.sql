CREATE TABLE `personal_access_tokens` (
                                          `id` int(11) NOT NULL AUTO_INCREMENT,
                                          `token` varchar(36) COLLATE utf8mb4_unicode_ci NOT NULL,
                                          `user_id` int(11) NOT NULL,
                                          `expires_at` datetime NOT NULL,
                                          PRIMARY KEY (`id`),
                                          UNIQUE KEY `token` (`token`),
                                          KEY `user_id` (`user_id`),
                                          CONSTRAINT `personal_access_tokens_user_id_fk`
                                              FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;