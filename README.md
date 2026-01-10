# 🌐 Social Web Project 
---

Notion : https://www.notion.so/forum-project-2de9b47f69c5806b95b5d81941a10bb4?source=copy_link

---

## 📖 프로젝트 소개

💡 **Only open source available** <br />
Spring Boot 기반의 신뢰도 높은 커뮤니티 플랫폼입니다.
기존 커뮤니티의 문제점을 해결하고자 광고 없는 쾌적한 환경을 제공합니다.


**사이트 주제** :

- [ ] 이커머스 플랫폼 
- [ ] 핀테크 & 디지털 결제 솔루션 
- [ ] AI 기반 웹 서비스
- [x] 커뮤니티 & 포럼 플랫폼 
- [ ] 온라인 교육 플랫폼

**사이트 이름** : Nexus(1차)

기존 유사 사이트에 비해 다른 점 : 
* 광고X

사이트가 제공하는 기능 : 
- 로그인/회원가입 
- 게시판 기능 (업로드, 삭제, 댓글, 첨부파일, 좋아요 등)
- 팔로우 기능 + 메시지 기능

## 💻 개발 환경
- open jdk 17.0.17
- Spring Boot 3.5.9
- MySQL 8.4.6
- Gradle

## dependencies
* Spring Boot Devtools
* Lombok
* Spring Configuration Processor
* Spring Web
* Thymeleaf
* MySql Driver
* Spring Data JPA
* log4jdbc
* thymeleaf-layout
* Thumbnailator

## Test DB

```sql
create database web1400;

use mysql;

create user 'webUser'@'localhost' identified by 'mysql';
grant all privileges on web1400.* to 'webUser'@'localhost';
flush privileges;

```


## 추가된 기능
- [ ] 페이지네이션 오프셋 기반 -> 커서 기반
- [x] oauth2.0
- [ ] 웹소켓 통신
