USE [master]
GO
/****** Object:  Database [TimeTracking]    Script Date: 1/2/2022 5:28:07 PM ******/
CREATE DATABASE [TimeTracking]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'TimeTracking', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\TimeTracking.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'TimeTracking_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\TimeTracking_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [TimeTracking] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [TimeTracking].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [TimeTracking] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [TimeTracking] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [TimeTracking] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [TimeTracking] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [TimeTracking] SET ARITHABORT OFF 
GO
ALTER DATABASE [TimeTracking] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [TimeTracking] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [TimeTracking] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [TimeTracking] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [TimeTracking] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [TimeTracking] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [TimeTracking] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [TimeTracking] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [TimeTracking] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [TimeTracking] SET  DISABLE_BROKER 
GO
ALTER DATABASE [TimeTracking] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [TimeTracking] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [TimeTracking] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [TimeTracking] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [TimeTracking] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [TimeTracking] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [TimeTracking] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [TimeTracking] SET RECOVERY FULL 
GO
ALTER DATABASE [TimeTracking] SET  MULTI_USER 
GO
ALTER DATABASE [TimeTracking] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [TimeTracking] SET DB_CHAINING OFF 
GO
ALTER DATABASE [TimeTracking] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [TimeTracking] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [TimeTracking] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [TimeTracking] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'TimeTracking', N'ON'
GO
ALTER DATABASE [TimeTracking] SET QUERY_STORE = OFF
GO
USE [TimeTracking]
GO
/****** Object:  Table [dbo].[DayTime]    Script Date: 1/2/2022 5:28:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DayTime](
	[Id] [int] NOT NULL,
	[Monday] [int] NOT NULL,
	[TuesDay] [int] NOT NULL,
	[WednesDay] [int] NOT NULL,
	[ThursDay] [int] NOT NULL,
	[FriDay] [int] NOT NULL,
	[SaturDay] [int] NOT NULL,
	[Sunday] [int] NOT NULL,
	[CreatedDateTime] [datetime] NOT NULL,
	[UpdatedDateTime] [datetime] NOT NULL,
	[WeekId] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hibernate_sequence]    Script Date: 1/2/2022 5:28:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hibernate_sequence](
	[next_val] [bigint] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[login]    Script Date: 1/2/2022 5:28:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[login](
	[login_id] [int] NOT NULL,
	[password] [varchar](255) NULL,
	[username] [varchar](255) NULL,
	[is_active] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[login_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[roles]    Script Date: 1/2/2022 5:28:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[roles](
	[role_id] [int] NOT NULL,
	[role_description] [varchar](255) NULL,
	[role_name] [varchar](255) NULL,
	[created_datetime] [datetime2](7) NULL,
	[updated_datetime] [datetime2](7) NULL,
PRIMARY KEY CLUSTERED 
(
	[role_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[users]    Script Date: 1/2/2022 5:28:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[users](
	[id] [int] NOT NULL,
	[created_date_time] [datetime2](7) NULL,
	[email] [varchar](255) NULL,
	[first_name] [varchar](255) NULL,
	[last_name] [varchar](255) NULL,
	[role_id] [varchar](255) NULL,
	[updated_date_time] [datetime2](7) NULL,
	[name] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[week]    Script Date: 1/2/2022 5:28:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[week](
	[week_id] [int] NOT NULL,
	[firday] [int] NOT NULL,
	[monday] [int] NOT NULL,
	[saturday] [int] NOT NULL,
	[sunday] [int] NOT NULL,
	[thursday] [int] NOT NULL,
	[tuesday] [int] NOT NULL,
	[user_id] [int] NOT NULL,
	[wednesday] [int] NOT NULL,
	[end_date] [datetime2](7) NULL,
	[start_date] [datetime2](7) NULL,
	[is_approved] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[week_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[WorkingHours]    Script Date: 1/2/2022 5:28:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[WorkingHours](
	[Id] [int] NOT NULL,
	[UserId] [int] NOT NULL,
	[WeekId] [int] NOT NULL,
	[CreatedDatetime] [datetime] NOT NULL,
	[UpdatedDatetime] [datetime] NOT NULL,
	[CreatedBy] [varchar](50) NULL,
	[UpdatedBy] [varchar](50) NULL,
	[IsApproved] [bit] NOT NULL
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[week] ADD  DEFAULT ((0)) FOR [is_approved]
GO
USE [master]
GO
ALTER DATABASE [TimeTracking] SET  READ_WRITE 
GO
