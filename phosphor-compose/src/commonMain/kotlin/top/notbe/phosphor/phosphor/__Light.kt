package top.notbe.phosphor.phosphor

import androidx.compose.ui.graphics.vector.ImageVector
import top.notbe.phosphor.Phosphor
import top.notbe.phosphor.phosphor.light.AddressBook
import top.notbe.phosphor.phosphor.light.AirTrafficControl
import top.notbe.phosphor.phosphor.light.Airplane
import top.notbe.phosphor.phosphor.light.AirplaneInFlight
import top.notbe.phosphor.phosphor.light.AirplaneLanding
import top.notbe.phosphor.phosphor.light.AirplaneTakeoff
import top.notbe.phosphor.phosphor.light.AirplaneTilt
import top.notbe.phosphor.phosphor.light.Airplay
import top.notbe.phosphor.phosphor.light.Alarm
import top.notbe.phosphor.phosphor.light.Alien
import top.notbe.phosphor.phosphor.light.AlignBottom
import top.notbe.phosphor.phosphor.light.AlignBottomSimple
import top.notbe.phosphor.phosphor.light.AlignCenterHorizontal
import top.notbe.phosphor.phosphor.light.AlignCenterHorizontalSimple
import top.notbe.phosphor.phosphor.light.AlignCenterVertical
import top.notbe.phosphor.phosphor.light.AlignCenterVerticalSimple
import top.notbe.phosphor.phosphor.light.AlignLeft
import top.notbe.phosphor.phosphor.light.AlignLeftSimple
import top.notbe.phosphor.phosphor.light.AlignRight
import top.notbe.phosphor.phosphor.light.AlignRightSimple
import top.notbe.phosphor.phosphor.light.AlignTop
import top.notbe.phosphor.phosphor.light.AlignTopSimple
import top.notbe.phosphor.phosphor.light.AmazonLogo
import top.notbe.phosphor.phosphor.light.Anchor
import top.notbe.phosphor.phosphor.light.AnchorSimple
import top.notbe.phosphor.phosphor.light.AndroidLogo
import top.notbe.phosphor.phosphor.light.AngularLogo
import top.notbe.phosphor.phosphor.light.Aperture
import top.notbe.phosphor.phosphor.light.AppStoreLogo
import top.notbe.phosphor.phosphor.light.AppWindow
import top.notbe.phosphor.phosphor.light.AppleLogo
import top.notbe.phosphor.phosphor.light.ApplePodcastsLogo
import top.notbe.phosphor.phosphor.light.Archive
import top.notbe.phosphor.phosphor.light.ArchiveBox
import top.notbe.phosphor.phosphor.light.ArchiveTray
import top.notbe.phosphor.phosphor.light.Armchair
import top.notbe.phosphor.phosphor.light.ArrowArcLeft
import top.notbe.phosphor.phosphor.light.ArrowArcRight
import top.notbe.phosphor.phosphor.light.ArrowBendDoubleUpLeft
import top.notbe.phosphor.phosphor.light.ArrowBendDoubleUpRight
import top.notbe.phosphor.phosphor.light.ArrowBendDownLeft
import top.notbe.phosphor.phosphor.light.ArrowBendDownRight
import top.notbe.phosphor.phosphor.light.ArrowBendLeftDown
import top.notbe.phosphor.phosphor.light.ArrowBendLeftUp
import top.notbe.phosphor.phosphor.light.ArrowBendRightDown
import top.notbe.phosphor.phosphor.light.ArrowBendRightUp
import top.notbe.phosphor.phosphor.light.ArrowBendUpLeft
import top.notbe.phosphor.phosphor.light.ArrowBendUpRight
import top.notbe.phosphor.phosphor.light.ArrowCircleDown
import top.notbe.phosphor.phosphor.light.ArrowCircleDownLeft
import top.notbe.phosphor.phosphor.light.ArrowCircleDownRight
import top.notbe.phosphor.phosphor.light.ArrowCircleLeft
import top.notbe.phosphor.phosphor.light.ArrowCircleRight
import top.notbe.phosphor.phosphor.light.ArrowCircleUp
import top.notbe.phosphor.phosphor.light.ArrowCircleUpLeft
import top.notbe.phosphor.phosphor.light.ArrowCircleUpRight
import top.notbe.phosphor.phosphor.light.ArrowClockwise
import top.notbe.phosphor.phosphor.light.ArrowCounterClockwise
import top.notbe.phosphor.phosphor.light.ArrowDown
import top.notbe.phosphor.phosphor.light.ArrowDownLeft
import top.notbe.phosphor.phosphor.light.ArrowDownRight
import top.notbe.phosphor.phosphor.light.ArrowElbowDownLeft
import top.notbe.phosphor.phosphor.light.ArrowElbowDownRight
import top.notbe.phosphor.phosphor.light.ArrowElbowLeft
import top.notbe.phosphor.phosphor.light.ArrowElbowLeftDown
import top.notbe.phosphor.phosphor.light.ArrowElbowLeftUp
import top.notbe.phosphor.phosphor.light.ArrowElbowRight
import top.notbe.phosphor.phosphor.light.ArrowElbowRightDown
import top.notbe.phosphor.phosphor.light.ArrowElbowRightUp
import top.notbe.phosphor.phosphor.light.ArrowElbowUpLeft
import top.notbe.phosphor.phosphor.light.ArrowElbowUpRight
import top.notbe.phosphor.phosphor.light.ArrowFatDown
import top.notbe.phosphor.phosphor.light.ArrowFatLeft
import top.notbe.phosphor.phosphor.light.ArrowFatLineDown
import top.notbe.phosphor.phosphor.light.ArrowFatLineLeft
import top.notbe.phosphor.phosphor.light.ArrowFatLineRight
import top.notbe.phosphor.phosphor.light.ArrowFatLineUp
import top.notbe.phosphor.phosphor.light.ArrowFatLinesDown
import top.notbe.phosphor.phosphor.light.ArrowFatLinesLeft
import top.notbe.phosphor.phosphor.light.ArrowFatLinesRight
import top.notbe.phosphor.phosphor.light.ArrowFatLinesUp
import top.notbe.phosphor.phosphor.light.ArrowFatRight
import top.notbe.phosphor.phosphor.light.ArrowFatUp
import top.notbe.phosphor.phosphor.light.ArrowLeft
import top.notbe.phosphor.phosphor.light.ArrowLineDown
import top.notbe.phosphor.phosphor.light.ArrowLineDownLeft
import top.notbe.phosphor.phosphor.light.ArrowLineDownRight
import top.notbe.phosphor.phosphor.light.ArrowLineLeft
import top.notbe.phosphor.phosphor.light.ArrowLineRight
import top.notbe.phosphor.phosphor.light.ArrowLineUp
import top.notbe.phosphor.phosphor.light.ArrowLineUpLeft
import top.notbe.phosphor.phosphor.light.ArrowLineUpRight
import top.notbe.phosphor.phosphor.light.ArrowRight
import top.notbe.phosphor.phosphor.light.ArrowSquareDown
import top.notbe.phosphor.phosphor.light.ArrowSquareDownLeft
import top.notbe.phosphor.phosphor.light.ArrowSquareDownRight
import top.notbe.phosphor.phosphor.light.ArrowSquareIn
import top.notbe.phosphor.phosphor.light.ArrowSquareLeft
import top.notbe.phosphor.phosphor.light.ArrowSquareOut
import top.notbe.phosphor.phosphor.light.ArrowSquareRight
import top.notbe.phosphor.phosphor.light.ArrowSquareUp
import top.notbe.phosphor.phosphor.light.ArrowSquareUpLeft
import top.notbe.phosphor.phosphor.light.ArrowSquareUpRight
import top.notbe.phosphor.phosphor.light.ArrowUDownLeft
import top.notbe.phosphor.phosphor.light.ArrowUDownRight
import top.notbe.phosphor.phosphor.light.ArrowULeftDown
import top.notbe.phosphor.phosphor.light.ArrowULeftUp
import top.notbe.phosphor.phosphor.light.ArrowURightDown
import top.notbe.phosphor.phosphor.light.ArrowURightUp
import top.notbe.phosphor.phosphor.light.ArrowUUpLeft
import top.notbe.phosphor.phosphor.light.ArrowUUpRight
import top.notbe.phosphor.phosphor.light.ArrowUp
import top.notbe.phosphor.phosphor.light.ArrowUpLeft
import top.notbe.phosphor.phosphor.light.ArrowUpRight
import top.notbe.phosphor.phosphor.light.ArrowsClockwise
import top.notbe.phosphor.phosphor.light.ArrowsCounterClockwise
import top.notbe.phosphor.phosphor.light.ArrowsDownUp
import top.notbe.phosphor.phosphor.light.ArrowsHorizontal
import top.notbe.phosphor.phosphor.light.ArrowsIn
import top.notbe.phosphor.phosphor.light.ArrowsInCardinal
import top.notbe.phosphor.phosphor.light.ArrowsInLineHorizontal
import top.notbe.phosphor.phosphor.light.ArrowsInLineVertical
import top.notbe.phosphor.phosphor.light.ArrowsInSimple
import top.notbe.phosphor.phosphor.light.ArrowsLeftRight
import top.notbe.phosphor.phosphor.light.ArrowsMerge
import top.notbe.phosphor.phosphor.light.ArrowsOut
import top.notbe.phosphor.phosphor.light.ArrowsOutCardinal
import top.notbe.phosphor.phosphor.light.ArrowsOutLineHorizontal
import top.notbe.phosphor.phosphor.light.ArrowsOutLineVertical
import top.notbe.phosphor.phosphor.light.ArrowsOutSimple
import top.notbe.phosphor.phosphor.light.ArrowsSplit
import top.notbe.phosphor.phosphor.light.ArrowsVertical
import top.notbe.phosphor.phosphor.light.Article
import top.notbe.phosphor.phosphor.light.ArticleMedium
import top.notbe.phosphor.phosphor.light.ArticleNyTimes
import top.notbe.phosphor.phosphor.light.Asterisk
import top.notbe.phosphor.phosphor.light.AsteriskSimple
import top.notbe.phosphor.phosphor.light.At
import top.notbe.phosphor.phosphor.light.Atom
import top.notbe.phosphor.phosphor.light.Baby
import top.notbe.phosphor.phosphor.light.Backpack
import top.notbe.phosphor.phosphor.light.Backspace
import top.notbe.phosphor.phosphor.light.Bag
import top.notbe.phosphor.phosphor.light.BagSimple
import top.notbe.phosphor.phosphor.light.Balloon
import top.notbe.phosphor.phosphor.light.Bandaids
import top.notbe.phosphor.phosphor.light.Bank
import top.notbe.phosphor.phosphor.light.Barbell
import top.notbe.phosphor.phosphor.light.Barcode
import top.notbe.phosphor.phosphor.light.Barricade
import top.notbe.phosphor.phosphor.light.Baseball
import top.notbe.phosphor.phosphor.light.BaseballCap
import top.notbe.phosphor.phosphor.light.Basket
import top.notbe.phosphor.phosphor.light.Basketball
import top.notbe.phosphor.phosphor.light.Bathtub
import top.notbe.phosphor.phosphor.light.BatteryCharging
import top.notbe.phosphor.phosphor.light.BatteryChargingVertical
import top.notbe.phosphor.phosphor.light.BatteryEmpty
import top.notbe.phosphor.phosphor.light.BatteryFull
import top.notbe.phosphor.phosphor.light.BatteryHigh
import top.notbe.phosphor.phosphor.light.BatteryLow
import top.notbe.phosphor.phosphor.light.BatteryMedium
import top.notbe.phosphor.phosphor.light.BatteryPlus
import top.notbe.phosphor.phosphor.light.BatteryPlusVertical
import top.notbe.phosphor.phosphor.light.BatteryVerticalEmpty
import top.notbe.phosphor.phosphor.light.BatteryVerticalFull
import top.notbe.phosphor.phosphor.light.BatteryVerticalHigh
import top.notbe.phosphor.phosphor.light.BatteryVerticalLow
import top.notbe.phosphor.phosphor.light.BatteryVerticalMedium
import top.notbe.phosphor.phosphor.light.BatteryWarning
import top.notbe.phosphor.phosphor.light.BatteryWarningVertical
import top.notbe.phosphor.phosphor.light.Bed
import top.notbe.phosphor.phosphor.light.BeerBottle
import top.notbe.phosphor.phosphor.light.BeerStein
import top.notbe.phosphor.phosphor.light.BehanceLogo
import top.notbe.phosphor.phosphor.light.Bell
import top.notbe.phosphor.phosphor.light.BellRinging
import top.notbe.phosphor.phosphor.light.BellSimple
import top.notbe.phosphor.phosphor.light.BellSimpleRinging
import top.notbe.phosphor.phosphor.light.BellSimpleSlash
import top.notbe.phosphor.phosphor.light.BellSimpleZ
import top.notbe.phosphor.phosphor.light.BellSlash
import top.notbe.phosphor.phosphor.light.BellZ
import top.notbe.phosphor.phosphor.light.BezierCurve
import top.notbe.phosphor.phosphor.light.Bicycle
import top.notbe.phosphor.phosphor.light.Binoculars
import top.notbe.phosphor.phosphor.light.Bird
import top.notbe.phosphor.phosphor.light.Bluetooth
import top.notbe.phosphor.phosphor.light.BluetoothConnected
import top.notbe.phosphor.phosphor.light.BluetoothSlash
import top.notbe.phosphor.phosphor.light.BluetoothX
import top.notbe.phosphor.phosphor.light.Boat
import top.notbe.phosphor.phosphor.light.Bone
import top.notbe.phosphor.phosphor.light.Book
import top.notbe.phosphor.phosphor.light.BookBookmark
import top.notbe.phosphor.phosphor.light.BookOpen
import top.notbe.phosphor.phosphor.light.BookOpenText
import top.notbe.phosphor.phosphor.light.Bookmark
import top.notbe.phosphor.phosphor.light.BookmarkSimple
import top.notbe.phosphor.phosphor.light.Bookmarks
import top.notbe.phosphor.phosphor.light.BookmarksSimple
import top.notbe.phosphor.phosphor.light.Books
import top.notbe.phosphor.phosphor.light.Boot
import top.notbe.phosphor.phosphor.light.BoundingBox
import top.notbe.phosphor.phosphor.light.BowlFood
import top.notbe.phosphor.phosphor.light.BracketsAngle
import top.notbe.phosphor.phosphor.light.BracketsCurly
import top.notbe.phosphor.phosphor.light.BracketsRound
import top.notbe.phosphor.phosphor.light.BracketsSquare
import top.notbe.phosphor.phosphor.light.Brain
import top.notbe.phosphor.phosphor.light.Brandy
import top.notbe.phosphor.phosphor.light.Bridge
import top.notbe.phosphor.phosphor.light.Briefcase
import top.notbe.phosphor.phosphor.light.BriefcaseMetal
import top.notbe.phosphor.phosphor.light.Broadcast
import top.notbe.phosphor.phosphor.light.Broom
import top.notbe.phosphor.phosphor.light.Browser
import top.notbe.phosphor.phosphor.light.Browsers
import top.notbe.phosphor.phosphor.light.Bug
import top.notbe.phosphor.phosphor.light.BugBeetle
import top.notbe.phosphor.phosphor.light.BugDroid
import top.notbe.phosphor.phosphor.light.Buildings
import top.notbe.phosphor.phosphor.light.Bus
import top.notbe.phosphor.phosphor.light.Butterfly
import top.notbe.phosphor.phosphor.light.Cactus
import top.notbe.phosphor.phosphor.light.Cake
import top.notbe.phosphor.phosphor.light.Calculator
import top.notbe.phosphor.phosphor.light.Calendar
import top.notbe.phosphor.phosphor.light.CalendarBlank
import top.notbe.phosphor.phosphor.light.CalendarCheck
import top.notbe.phosphor.phosphor.light.CalendarPlus
import top.notbe.phosphor.phosphor.light.CalendarX
import top.notbe.phosphor.phosphor.light.CallBell
import top.notbe.phosphor.phosphor.light.Camera
import top.notbe.phosphor.phosphor.light.CameraPlus
import top.notbe.phosphor.phosphor.light.CameraRotate
import top.notbe.phosphor.phosphor.light.CameraSlash
import top.notbe.phosphor.phosphor.light.Campfire
import top.notbe.phosphor.phosphor.light.Car
import top.notbe.phosphor.phosphor.light.CarProfile
import top.notbe.phosphor.phosphor.light.CarSimple
import top.notbe.phosphor.phosphor.light.Cardholder
import top.notbe.phosphor.phosphor.light.Cards
import top.notbe.phosphor.phosphor.light.CaretCircleDoubleDown
import top.notbe.phosphor.phosphor.light.CaretCircleDoubleLeft
import top.notbe.phosphor.phosphor.light.CaretCircleDoubleRight
import top.notbe.phosphor.phosphor.light.CaretCircleDoubleUp
import top.notbe.phosphor.phosphor.light.CaretCircleDown
import top.notbe.phosphor.phosphor.light.CaretCircleLeft
import top.notbe.phosphor.phosphor.light.CaretCircleRight
import top.notbe.phosphor.phosphor.light.CaretCircleUp
import top.notbe.phosphor.phosphor.light.CaretCircleUpDown
import top.notbe.phosphor.phosphor.light.CaretDoubleDown
import top.notbe.phosphor.phosphor.light.CaretDoubleLeft
import top.notbe.phosphor.phosphor.light.CaretDoubleRight
import top.notbe.phosphor.phosphor.light.CaretDoubleUp
import top.notbe.phosphor.phosphor.light.CaretDown
import top.notbe.phosphor.phosphor.light.CaretLeft
import top.notbe.phosphor.phosphor.light.CaretRight
import top.notbe.phosphor.phosphor.light.CaretUp
import top.notbe.phosphor.phosphor.light.CaretUpDown
import top.notbe.phosphor.phosphor.light.Carrot
import top.notbe.phosphor.phosphor.light.CassetteTape
import top.notbe.phosphor.phosphor.light.CastleTurret
import top.notbe.phosphor.phosphor.light.Cat
import top.notbe.phosphor.phosphor.light.CellSignalFull
import top.notbe.phosphor.phosphor.light.CellSignalHigh
import top.notbe.phosphor.phosphor.light.CellSignalLow
import top.notbe.phosphor.phosphor.light.CellSignalMedium
import top.notbe.phosphor.phosphor.light.CellSignalNone
import top.notbe.phosphor.phosphor.light.CellSignalSlash
import top.notbe.phosphor.phosphor.light.CellSignalX
import top.notbe.phosphor.phosphor.light.Certificate
import top.notbe.phosphor.phosphor.light.Chair
import top.notbe.phosphor.phosphor.light.Chalkboard
import top.notbe.phosphor.phosphor.light.ChalkboardSimple
import top.notbe.phosphor.phosphor.light.ChalkboardTeacher
import top.notbe.phosphor.phosphor.light.Champagne
import top.notbe.phosphor.phosphor.light.ChargingStation
import top.notbe.phosphor.phosphor.light.ChartBar
import top.notbe.phosphor.phosphor.light.ChartBarHorizontal
import top.notbe.phosphor.phosphor.light.ChartDonut
import top.notbe.phosphor.phosphor.light.ChartLine
import top.notbe.phosphor.phosphor.light.ChartLineDown
import top.notbe.phosphor.phosphor.light.ChartLineUp
import top.notbe.phosphor.phosphor.light.ChartPie
import top.notbe.phosphor.phosphor.light.ChartPieSlice
import top.notbe.phosphor.phosphor.light.ChartPolar
import top.notbe.phosphor.phosphor.light.ChartScatter
import top.notbe.phosphor.phosphor.light.Chat
import top.notbe.phosphor.phosphor.light.ChatCentered
import top.notbe.phosphor.phosphor.light.ChatCenteredDots
import top.notbe.phosphor.phosphor.light.ChatCenteredText
import top.notbe.phosphor.phosphor.light.ChatCircle
import top.notbe.phosphor.phosphor.light.ChatCircleDots
import top.notbe.phosphor.phosphor.light.ChatCircleText
import top.notbe.phosphor.phosphor.light.ChatDots
import top.notbe.phosphor.phosphor.light.ChatTeardrop
import top.notbe.phosphor.phosphor.light.ChatTeardropDots
import top.notbe.phosphor.phosphor.light.ChatTeardropText
import top.notbe.phosphor.phosphor.light.ChatText
import top.notbe.phosphor.phosphor.light.Chats
import top.notbe.phosphor.phosphor.light.ChatsCircle
import top.notbe.phosphor.phosphor.light.ChatsTeardrop
import top.notbe.phosphor.phosphor.light.Check
import top.notbe.phosphor.phosphor.light.CheckCircle
import top.notbe.phosphor.phosphor.light.CheckFat
import top.notbe.phosphor.phosphor.light.CheckSquare
import top.notbe.phosphor.phosphor.light.CheckSquareOffset
import top.notbe.phosphor.phosphor.light.Checks
import top.notbe.phosphor.phosphor.light.Church
import top.notbe.phosphor.phosphor.light.Circle
import top.notbe.phosphor.phosphor.light.CircleDashed
import top.notbe.phosphor.phosphor.light.CircleHalf
import top.notbe.phosphor.phosphor.light.CircleHalfTilt
import top.notbe.phosphor.phosphor.light.CircleNotch
import top.notbe.phosphor.phosphor.light.CirclesFour
import top.notbe.phosphor.phosphor.light.CirclesThree
import top.notbe.phosphor.phosphor.light.CirclesThreePlus
import top.notbe.phosphor.phosphor.light.Circuitry
import top.notbe.phosphor.phosphor.light.Clipboard
import top.notbe.phosphor.phosphor.light.ClipboardText
import top.notbe.phosphor.phosphor.light.Clock
import top.notbe.phosphor.phosphor.light.ClockAfternoon
import top.notbe.phosphor.phosphor.light.ClockClockwise
import top.notbe.phosphor.phosphor.light.ClockCountdown
import top.notbe.phosphor.phosphor.light.ClockCounterClockwise
import top.notbe.phosphor.phosphor.light.ClosedCaptioning
import top.notbe.phosphor.phosphor.light.Cloud
import top.notbe.phosphor.phosphor.light.CloudArrowDown
import top.notbe.phosphor.phosphor.light.CloudArrowUp
import top.notbe.phosphor.phosphor.light.CloudCheck
import top.notbe.phosphor.phosphor.light.CloudFog
import top.notbe.phosphor.phosphor.light.CloudLightning
import top.notbe.phosphor.phosphor.light.CloudMoon
import top.notbe.phosphor.phosphor.light.CloudRain
import top.notbe.phosphor.phosphor.light.CloudSlash
import top.notbe.phosphor.phosphor.light.CloudSnow
import top.notbe.phosphor.phosphor.light.CloudSun
import top.notbe.phosphor.phosphor.light.CloudWarning
import top.notbe.phosphor.phosphor.light.CloudX
import top.notbe.phosphor.phosphor.light.Club
import top.notbe.phosphor.phosphor.light.CoatHanger
import top.notbe.phosphor.phosphor.light.CodaLogo
import top.notbe.phosphor.phosphor.light.Code
import top.notbe.phosphor.phosphor.light.CodeBlock
import top.notbe.phosphor.phosphor.light.CodeSimple
import top.notbe.phosphor.phosphor.light.CodepenLogo
import top.notbe.phosphor.phosphor.light.CodesandboxLogo
import top.notbe.phosphor.phosphor.light.Coffee
import top.notbe.phosphor.phosphor.light.Coin
import top.notbe.phosphor.phosphor.light.CoinVertical
import top.notbe.phosphor.phosphor.light.Coins
import top.notbe.phosphor.phosphor.light.Columns
import top.notbe.phosphor.phosphor.light.Command
import top.notbe.phosphor.phosphor.light.Compass
import top.notbe.phosphor.phosphor.light.CompassTool
import top.notbe.phosphor.phosphor.light.ComputerTower
import top.notbe.phosphor.phosphor.light.Confetti
import top.notbe.phosphor.phosphor.light.ContactlessPayment
import top.notbe.phosphor.phosphor.light.Control
import top.notbe.phosphor.phosphor.light.Cookie
import top.notbe.phosphor.phosphor.light.CookingPot
import top.notbe.phosphor.phosphor.light.Copy
import top.notbe.phosphor.phosphor.light.CopySimple
import top.notbe.phosphor.phosphor.light.Copyleft
import top.notbe.phosphor.phosphor.light.Copyright
import top.notbe.phosphor.phosphor.light.CornersIn
import top.notbe.phosphor.phosphor.light.CornersOut
import top.notbe.phosphor.phosphor.light.Couch
import top.notbe.phosphor.phosphor.light.Cpu
import top.notbe.phosphor.phosphor.light.CreditCard
import top.notbe.phosphor.phosphor.light.Crop
import top.notbe.phosphor.phosphor.light.Cross
import top.notbe.phosphor.phosphor.light.Crosshair
import top.notbe.phosphor.phosphor.light.CrosshairSimple
import top.notbe.phosphor.phosphor.light.Crown
import top.notbe.phosphor.phosphor.light.CrownSimple
import top.notbe.phosphor.phosphor.light.Cube
import top.notbe.phosphor.phosphor.light.CubeFocus
import top.notbe.phosphor.phosphor.light.CubeTransparent
import top.notbe.phosphor.phosphor.light.CurrencyBtc
import top.notbe.phosphor.phosphor.light.CurrencyCircleDollar
import top.notbe.phosphor.phosphor.light.CurrencyCny
import top.notbe.phosphor.phosphor.light.CurrencyDollar
import top.notbe.phosphor.phosphor.light.CurrencyDollarSimple
import top.notbe.phosphor.phosphor.light.CurrencyEth
import top.notbe.phosphor.phosphor.light.CurrencyEur
import top.notbe.phosphor.phosphor.light.CurrencyGbp
import top.notbe.phosphor.phosphor.light.CurrencyInr
import top.notbe.phosphor.phosphor.light.CurrencyJpy
import top.notbe.phosphor.phosphor.light.CurrencyKrw
import top.notbe.phosphor.phosphor.light.CurrencyKzt
import top.notbe.phosphor.phosphor.light.CurrencyNgn
import top.notbe.phosphor.phosphor.light.CurrencyRub
import top.notbe.phosphor.phosphor.light.Cursor
import top.notbe.phosphor.phosphor.light.CursorClick
import top.notbe.phosphor.phosphor.light.CursorText
import top.notbe.phosphor.phosphor.light.Cylinder
import top.notbe.phosphor.phosphor.light.Database
import top.notbe.phosphor.phosphor.light.Desktop
import top.notbe.phosphor.phosphor.light.DesktopTower
import top.notbe.phosphor.phosphor.light.Detective
import top.notbe.phosphor.phosphor.light.DevToLogo
import top.notbe.phosphor.phosphor.light.DeviceMobile
import top.notbe.phosphor.phosphor.light.DeviceMobileCamera
import top.notbe.phosphor.phosphor.light.DeviceMobileSpeaker
import top.notbe.phosphor.phosphor.light.DeviceTablet
import top.notbe.phosphor.phosphor.light.DeviceTabletCamera
import top.notbe.phosphor.phosphor.light.DeviceTabletSpeaker
import top.notbe.phosphor.phosphor.light.Devices
import top.notbe.phosphor.phosphor.light.Diamond
import top.notbe.phosphor.phosphor.light.DiamondsFour
import top.notbe.phosphor.phosphor.light.DiceFive
import top.notbe.phosphor.phosphor.light.DiceFour
import top.notbe.phosphor.phosphor.light.DiceOne
import top.notbe.phosphor.phosphor.light.DiceSix
import top.notbe.phosphor.phosphor.light.DiceThree
import top.notbe.phosphor.phosphor.light.DiceTwo
import top.notbe.phosphor.phosphor.light.Disc
import top.notbe.phosphor.phosphor.light.DiscordLogo
import top.notbe.phosphor.phosphor.light.Divide
import top.notbe.phosphor.phosphor.light.Dna
import top.notbe.phosphor.phosphor.light.Dog
import top.notbe.phosphor.phosphor.light.Door
import top.notbe.phosphor.phosphor.light.DoorOpen
import top.notbe.phosphor.phosphor.light.Dot
import top.notbe.phosphor.phosphor.light.DotOutline
import top.notbe.phosphor.phosphor.light.DotsNine
import top.notbe.phosphor.phosphor.light.DotsSix
import top.notbe.phosphor.phosphor.light.DotsSixVertical
import top.notbe.phosphor.phosphor.light.DotsThree
import top.notbe.phosphor.phosphor.light.DotsThreeCircle
import top.notbe.phosphor.phosphor.light.DotsThreeCircleVertical
import top.notbe.phosphor.phosphor.light.DotsThreeOutline
import top.notbe.phosphor.phosphor.light.DotsThreeOutlineVertical
import top.notbe.phosphor.phosphor.light.DotsThreeVertical
import top.notbe.phosphor.phosphor.light.Download
import top.notbe.phosphor.phosphor.light.DownloadSimple
import top.notbe.phosphor.phosphor.light.Dress
import top.notbe.phosphor.phosphor.light.DribbbleLogo
import top.notbe.phosphor.phosphor.light.Drop
import top.notbe.phosphor.phosphor.light.DropHalf
import top.notbe.phosphor.phosphor.light.DropHalfBottom
import top.notbe.phosphor.phosphor.light.DropboxLogo
import top.notbe.phosphor.phosphor.light.Ear
import top.notbe.phosphor.phosphor.light.EarSlash
import top.notbe.phosphor.phosphor.light.Egg
import top.notbe.phosphor.phosphor.light.EggCrack
import top.notbe.phosphor.phosphor.light.Eject
import top.notbe.phosphor.phosphor.light.EjectSimple
import top.notbe.phosphor.phosphor.light.Elevator
import top.notbe.phosphor.phosphor.light.Engine
import top.notbe.phosphor.phosphor.light.Envelope
import top.notbe.phosphor.phosphor.light.EnvelopeOpen
import top.notbe.phosphor.phosphor.light.EnvelopeSimple
import top.notbe.phosphor.phosphor.light.EnvelopeSimpleOpen
import top.notbe.phosphor.phosphor.light.Equalizer
import top.notbe.phosphor.phosphor.light.Equals
import top.notbe.phosphor.phosphor.light.Eraser
import top.notbe.phosphor.phosphor.light.EscalatorDown
import top.notbe.phosphor.phosphor.light.EscalatorUp
import top.notbe.phosphor.phosphor.light.Exam
import top.notbe.phosphor.phosphor.light.Exclude
import top.notbe.phosphor.phosphor.light.ExcludeSquare
import top.notbe.phosphor.phosphor.light.Export
import top.notbe.phosphor.phosphor.light.Eye
import top.notbe.phosphor.phosphor.light.EyeClosed
import top.notbe.phosphor.phosphor.light.EyeSlash
import top.notbe.phosphor.phosphor.light.Eyedropper
import top.notbe.phosphor.phosphor.light.EyedropperSample
import top.notbe.phosphor.phosphor.light.Eyeglasses
import top.notbe.phosphor.phosphor.light.FaceMask
import top.notbe.phosphor.phosphor.light.FacebookLogo
import top.notbe.phosphor.phosphor.light.Factory
import top.notbe.phosphor.phosphor.light.Faders
import top.notbe.phosphor.phosphor.light.FadersHorizontal
import top.notbe.phosphor.phosphor.light.Fan
import top.notbe.phosphor.phosphor.light.FastForward
import top.notbe.phosphor.phosphor.light.FastForwardCircle
import top.notbe.phosphor.phosphor.light.Feather
import top.notbe.phosphor.phosphor.light.FigmaLogo
import top.notbe.phosphor.phosphor.light.File
import top.notbe.phosphor.phosphor.light.FileArchive
import top.notbe.phosphor.phosphor.light.FileArrowDown
import top.notbe.phosphor.phosphor.light.FileArrowUp
import top.notbe.phosphor.phosphor.light.FileAudio
import top.notbe.phosphor.phosphor.light.FileCloud
import top.notbe.phosphor.phosphor.light.FileCode
import top.notbe.phosphor.phosphor.light.FileCss
import top.notbe.phosphor.phosphor.light.FileCsv
import top.notbe.phosphor.phosphor.light.FileDashed
import top.notbe.phosphor.phosphor.light.FileDoc
import top.notbe.phosphor.phosphor.light.FileHtml
import top.notbe.phosphor.phosphor.light.FileImage
import top.notbe.phosphor.phosphor.light.FileJpg
import top.notbe.phosphor.phosphor.light.FileJs
import top.notbe.phosphor.phosphor.light.FileJsx
import top.notbe.phosphor.phosphor.light.FileLock
import top.notbe.phosphor.phosphor.light.FileMagnifyingGlass
import top.notbe.phosphor.phosphor.light.FileMinus
import top.notbe.phosphor.phosphor.light.FilePdf
import top.notbe.phosphor.phosphor.light.FilePlus
import top.notbe.phosphor.phosphor.light.FilePng
import top.notbe.phosphor.phosphor.light.FilePpt
import top.notbe.phosphor.phosphor.light.FileRs
import top.notbe.phosphor.phosphor.light.FileSql
import top.notbe.phosphor.phosphor.light.FileSvg
import top.notbe.phosphor.phosphor.light.FileText
import top.notbe.phosphor.phosphor.light.FileTs
import top.notbe.phosphor.phosphor.light.FileTsx
import top.notbe.phosphor.phosphor.light.FileVideo
import top.notbe.phosphor.phosphor.light.FileVue
import top.notbe.phosphor.phosphor.light.FileX
import top.notbe.phosphor.phosphor.light.FileXls
import top.notbe.phosphor.phosphor.light.FileZip
import top.notbe.phosphor.phosphor.light.Files
import top.notbe.phosphor.phosphor.light.FilmReel
import top.notbe.phosphor.phosphor.light.FilmScript
import top.notbe.phosphor.phosphor.light.FilmSlate
import top.notbe.phosphor.phosphor.light.FilmStrip
import top.notbe.phosphor.phosphor.light.Fingerprint
import top.notbe.phosphor.phosphor.light.FingerprintSimple
import top.notbe.phosphor.phosphor.light.FinnTheHuman
import top.notbe.phosphor.phosphor.light.Fire
import top.notbe.phosphor.phosphor.light.FireExtinguisher
import top.notbe.phosphor.phosphor.light.FireSimple
import top.notbe.phosphor.phosphor.light.FirstAid
import top.notbe.phosphor.phosphor.light.FirstAidKit
import top.notbe.phosphor.phosphor.light.Fish
import top.notbe.phosphor.phosphor.light.FishSimple
import top.notbe.phosphor.phosphor.light.Flag
import top.notbe.phosphor.phosphor.light.FlagBanner
import top.notbe.phosphor.phosphor.light.FlagCheckered
import top.notbe.phosphor.phosphor.light.FlagPennant
import top.notbe.phosphor.phosphor.light.Flame
import top.notbe.phosphor.phosphor.light.Flashlight
import top.notbe.phosphor.phosphor.light.Flask
import top.notbe.phosphor.phosphor.light.FloppyDisk
import top.notbe.phosphor.phosphor.light.FloppyDiskBack
import top.notbe.phosphor.phosphor.light.FlowArrow
import top.notbe.phosphor.phosphor.light.Flower
import top.notbe.phosphor.phosphor.light.FlowerLotus
import top.notbe.phosphor.phosphor.light.FlowerTulip
import top.notbe.phosphor.phosphor.light.FlyingSaucer
import top.notbe.phosphor.phosphor.light.Folder
import top.notbe.phosphor.phosphor.light.FolderDashed
import top.notbe.phosphor.phosphor.light.FolderLock
import top.notbe.phosphor.phosphor.light.FolderMinus
import top.notbe.phosphor.phosphor.light.FolderNotch
import top.notbe.phosphor.phosphor.light.FolderNotchMinus
import top.notbe.phosphor.phosphor.light.FolderNotchOpen
import top.notbe.phosphor.phosphor.light.FolderNotchPlus
import top.notbe.phosphor.phosphor.light.FolderOpen
import top.notbe.phosphor.phosphor.light.FolderPlus
import top.notbe.phosphor.phosphor.light.FolderSimple
import top.notbe.phosphor.phosphor.light.FolderSimpleDashed
import top.notbe.phosphor.phosphor.light.FolderSimpleLock
import top.notbe.phosphor.phosphor.light.FolderSimpleMinus
import top.notbe.phosphor.phosphor.light.FolderSimplePlus
import top.notbe.phosphor.phosphor.light.FolderSimpleStar
import top.notbe.phosphor.phosphor.light.FolderSimpleUser
import top.notbe.phosphor.phosphor.light.FolderStar
import top.notbe.phosphor.phosphor.light.FolderUser
import top.notbe.phosphor.phosphor.light.Folders
import top.notbe.phosphor.phosphor.light.Football
import top.notbe.phosphor.phosphor.light.Footprints
import top.notbe.phosphor.phosphor.light.ForkKnife
import top.notbe.phosphor.phosphor.light.FrameCorners
import top.notbe.phosphor.phosphor.light.FramerLogo
import top.notbe.phosphor.phosphor.light.Function
import top.notbe.phosphor.phosphor.light.Funnel
import top.notbe.phosphor.phosphor.light.FunnelSimple
import top.notbe.phosphor.phosphor.light.GameController
import top.notbe.phosphor.phosphor.light.Garage
import top.notbe.phosphor.phosphor.light.GasCan
import top.notbe.phosphor.phosphor.light.GasPump
import top.notbe.phosphor.phosphor.light.Gauge
import top.notbe.phosphor.phosphor.light.Gavel
import top.notbe.phosphor.phosphor.light.Gear
import top.notbe.phosphor.phosphor.light.GearFine
import top.notbe.phosphor.phosphor.light.GearSix
import top.notbe.phosphor.phosphor.light.GenderFemale
import top.notbe.phosphor.phosphor.light.GenderIntersex
import top.notbe.phosphor.phosphor.light.GenderMale
import top.notbe.phosphor.phosphor.light.GenderNeuter
import top.notbe.phosphor.phosphor.light.GenderNonbinary
import top.notbe.phosphor.phosphor.light.GenderTransgender
import top.notbe.phosphor.phosphor.light.Ghost
import top.notbe.phosphor.phosphor.light.Gif
import top.notbe.phosphor.phosphor.light.Gift
import top.notbe.phosphor.phosphor.light.GitBranch
import top.notbe.phosphor.phosphor.light.GitCommit
import top.notbe.phosphor.phosphor.light.GitDiff
import top.notbe.phosphor.phosphor.light.GitFork
import top.notbe.phosphor.phosphor.light.GitMerge
import top.notbe.phosphor.phosphor.light.GitPullRequest
import top.notbe.phosphor.phosphor.light.GithubLogo
import top.notbe.phosphor.phosphor.light.GitlabLogo
import top.notbe.phosphor.phosphor.light.GitlabLogoSimple
import top.notbe.phosphor.phosphor.light.Globe
import top.notbe.phosphor.phosphor.light.GlobeHemisphereEast
import top.notbe.phosphor.phosphor.light.GlobeHemisphereWest
import top.notbe.phosphor.phosphor.light.GlobeSimple
import top.notbe.phosphor.phosphor.light.GlobeStand
import top.notbe.phosphor.phosphor.light.Goggles
import top.notbe.phosphor.phosphor.light.GoodreadsLogo
import top.notbe.phosphor.phosphor.light.GoogleCardboardLogo
import top.notbe.phosphor.phosphor.light.GoogleChromeLogo
import top.notbe.phosphor.phosphor.light.GoogleDriveLogo
import top.notbe.phosphor.phosphor.light.GoogleLogo
import top.notbe.phosphor.phosphor.light.GooglePhotosLogo
import top.notbe.phosphor.phosphor.light.GooglePlayLogo
import top.notbe.phosphor.phosphor.light.GooglePodcastsLogo
import top.notbe.phosphor.phosphor.light.Gradient
import top.notbe.phosphor.phosphor.light.GraduationCap
import top.notbe.phosphor.phosphor.light.Grains
import top.notbe.phosphor.phosphor.light.GrainsSlash
import top.notbe.phosphor.phosphor.light.Graph
import top.notbe.phosphor.phosphor.light.GridFour
import top.notbe.phosphor.phosphor.light.GridNine
import top.notbe.phosphor.phosphor.light.Guitar
import top.notbe.phosphor.phosphor.light.Hamburger
import top.notbe.phosphor.phosphor.light.Hammer
import top.notbe.phosphor.phosphor.light.Hand
import top.notbe.phosphor.phosphor.light.HandCoins
import top.notbe.phosphor.phosphor.light.HandEye
import top.notbe.phosphor.phosphor.light.HandFist
import top.notbe.phosphor.phosphor.light.HandGrabbing
import top.notbe.phosphor.phosphor.light.HandHeart
import top.notbe.phosphor.phosphor.light.HandPalm
import top.notbe.phosphor.phosphor.light.HandPointing
import top.notbe.phosphor.phosphor.light.HandSoap
import top.notbe.phosphor.phosphor.light.HandSwipeLeft
import top.notbe.phosphor.phosphor.light.HandSwipeRight
import top.notbe.phosphor.phosphor.light.HandTap
import top.notbe.phosphor.phosphor.light.HandWaving
import top.notbe.phosphor.phosphor.light.Handbag
import top.notbe.phosphor.phosphor.light.HandbagSimple
import top.notbe.phosphor.phosphor.light.HandsClapping
import top.notbe.phosphor.phosphor.light.HandsPraying
import top.notbe.phosphor.phosphor.light.Handshake
import top.notbe.phosphor.phosphor.light.HardDrive
import top.notbe.phosphor.phosphor.light.HardDrives
import top.notbe.phosphor.phosphor.light.Hash
import top.notbe.phosphor.phosphor.light.HashStraight
import top.notbe.phosphor.phosphor.light.Headlights
import top.notbe.phosphor.phosphor.light.Headphones
import top.notbe.phosphor.phosphor.light.Headset
import top.notbe.phosphor.phosphor.light.Heart
import top.notbe.phosphor.phosphor.light.HeartBreak
import top.notbe.phosphor.phosphor.light.HeartHalf
import top.notbe.phosphor.phosphor.light.HeartStraight
import top.notbe.phosphor.phosphor.light.HeartStraightBreak
import top.notbe.phosphor.phosphor.light.Heartbeat
import top.notbe.phosphor.phosphor.light.Hexagon
import top.notbe.phosphor.phosphor.light.HighHeel
import top.notbe.phosphor.phosphor.light.HighlighterCircle
import top.notbe.phosphor.phosphor.light.Hoodie
import top.notbe.phosphor.phosphor.light.Horse
import top.notbe.phosphor.phosphor.light.Hourglass
import top.notbe.phosphor.phosphor.light.HourglassHigh
import top.notbe.phosphor.phosphor.light.HourglassLow
import top.notbe.phosphor.phosphor.light.HourglassMedium
import top.notbe.phosphor.phosphor.light.HourglassSimple
import top.notbe.phosphor.phosphor.light.HourglassSimpleHigh
import top.notbe.phosphor.phosphor.light.HourglassSimpleLow
import top.notbe.phosphor.phosphor.light.HourglassSimpleMedium
import top.notbe.phosphor.phosphor.light.House
import top.notbe.phosphor.phosphor.light.HouseLine
import top.notbe.phosphor.phosphor.light.HouseSimple
import top.notbe.phosphor.phosphor.light.IceCream
import top.notbe.phosphor.phosphor.light.IdentificationBadge
import top.notbe.phosphor.phosphor.light.IdentificationCard
import top.notbe.phosphor.phosphor.light.Image
import top.notbe.phosphor.phosphor.light.ImageSquare
import top.notbe.phosphor.phosphor.light.Images
import top.notbe.phosphor.phosphor.light.ImagesSquare
import top.notbe.phosphor.phosphor.light.Infinity
import top.notbe.phosphor.phosphor.light.Info
import top.notbe.phosphor.phosphor.light.InstagramLogo
import top.notbe.phosphor.phosphor.light.Intersect
import top.notbe.phosphor.phosphor.light.IntersectSquare
import top.notbe.phosphor.phosphor.light.IntersectThree
import top.notbe.phosphor.phosphor.light.Jeep
import top.notbe.phosphor.phosphor.light.Kanban
import top.notbe.phosphor.phosphor.light.Key
import top.notbe.phosphor.phosphor.light.KeyReturn
import top.notbe.phosphor.phosphor.light.Keyboard
import top.notbe.phosphor.phosphor.light.Keyhole
import top.notbe.phosphor.phosphor.light.Knife
import top.notbe.phosphor.phosphor.light.Ladder
import top.notbe.phosphor.phosphor.light.LadderSimple
import top.notbe.phosphor.phosphor.light.Lamp
import top.notbe.phosphor.phosphor.light.Laptop
import top.notbe.phosphor.phosphor.light.Layout
import top.notbe.phosphor.phosphor.light.Leaf
import top.notbe.phosphor.phosphor.light.Lifebuoy
import top.notbe.phosphor.phosphor.light.Lightbulb
import top.notbe.phosphor.phosphor.light.LightbulbFilament
import top.notbe.phosphor.phosphor.light.Lighthouse
import top.notbe.phosphor.phosphor.light.Lightning
import top.notbe.phosphor.phosphor.light.LightningA
import top.notbe.phosphor.phosphor.light.LightningSlash
import top.notbe.phosphor.phosphor.light.LineSegment
import top.notbe.phosphor.phosphor.light.LineSegments
import top.notbe.phosphor.phosphor.light.Link
import top.notbe.phosphor.phosphor.light.LinkBreak
import top.notbe.phosphor.phosphor.light.LinkSimple
import top.notbe.phosphor.phosphor.light.LinkSimpleBreak
import top.notbe.phosphor.phosphor.light.LinkSimpleHorizontal
import top.notbe.phosphor.phosphor.light.LinkSimpleHorizontalBreak
import top.notbe.phosphor.phosphor.light.LinkedinLogo
import top.notbe.phosphor.phosphor.light.LinuxLogo
import top.notbe.phosphor.phosphor.light.List
import top.notbe.phosphor.phosphor.light.ListBullets
import top.notbe.phosphor.phosphor.light.ListChecks
import top.notbe.phosphor.phosphor.light.ListDashes
import top.notbe.phosphor.phosphor.light.ListMagnifyingGlass
import top.notbe.phosphor.phosphor.light.ListNumbers
import top.notbe.phosphor.phosphor.light.ListPlus
import top.notbe.phosphor.phosphor.light.Lock
import top.notbe.phosphor.phosphor.light.LockKey
import top.notbe.phosphor.phosphor.light.LockKeyOpen
import top.notbe.phosphor.phosphor.light.LockLaminated
import top.notbe.phosphor.phosphor.light.LockLaminatedOpen
import top.notbe.phosphor.phosphor.light.LockOpen
import top.notbe.phosphor.phosphor.light.LockSimple
import top.notbe.phosphor.phosphor.light.LockSimpleOpen
import top.notbe.phosphor.phosphor.light.Lockers
import top.notbe.phosphor.phosphor.light.MagicWand
import top.notbe.phosphor.phosphor.light.Magnet
import top.notbe.phosphor.phosphor.light.MagnetStraight
import top.notbe.phosphor.phosphor.light.MagnifyingGlass
import top.notbe.phosphor.phosphor.light.MagnifyingGlassMinus
import top.notbe.phosphor.phosphor.light.MagnifyingGlassPlus
import top.notbe.phosphor.phosphor.light.MapPin
import top.notbe.phosphor.phosphor.light.MapPinLine
import top.notbe.phosphor.phosphor.light.MapTrifold
import top.notbe.phosphor.phosphor.light.MarkerCircle
import top.notbe.phosphor.phosphor.light.Martini
import top.notbe.phosphor.phosphor.light.MaskHappy
import top.notbe.phosphor.phosphor.light.MaskSad
import top.notbe.phosphor.phosphor.light.MathOperations
import top.notbe.phosphor.phosphor.light.Medal
import top.notbe.phosphor.phosphor.light.MedalMilitary
import top.notbe.phosphor.phosphor.light.MediumLogo
import top.notbe.phosphor.phosphor.light.Megaphone
import top.notbe.phosphor.phosphor.light.MegaphoneSimple
import top.notbe.phosphor.phosphor.light.MessengerLogo
import top.notbe.phosphor.phosphor.light.MetaLogo
import top.notbe.phosphor.phosphor.light.Metronome
import top.notbe.phosphor.phosphor.light.Microphone
import top.notbe.phosphor.phosphor.light.MicrophoneSlash
import top.notbe.phosphor.phosphor.light.MicrophoneStage
import top.notbe.phosphor.phosphor.light.MicrosoftExcelLogo
import top.notbe.phosphor.phosphor.light.MicrosoftOutlookLogo
import top.notbe.phosphor.phosphor.light.MicrosoftPowerpointLogo
import top.notbe.phosphor.phosphor.light.MicrosoftTeamsLogo
import top.notbe.phosphor.phosphor.light.MicrosoftWordLogo
import top.notbe.phosphor.phosphor.light.Minus
import top.notbe.phosphor.phosphor.light.MinusCircle
import top.notbe.phosphor.phosphor.light.MinusSquare
import top.notbe.phosphor.phosphor.light.Money
import top.notbe.phosphor.phosphor.light.Monitor
import top.notbe.phosphor.phosphor.light.MonitorPlay
import top.notbe.phosphor.phosphor.light.Moon
import top.notbe.phosphor.phosphor.light.MoonStars
import top.notbe.phosphor.phosphor.light.Moped
import top.notbe.phosphor.phosphor.light.MopedFront
import top.notbe.phosphor.phosphor.light.Mosque
import top.notbe.phosphor.phosphor.light.Motorcycle
import top.notbe.phosphor.phosphor.light.Mountains
import top.notbe.phosphor.phosphor.light.Mouse
import top.notbe.phosphor.phosphor.light.MouseSimple
import top.notbe.phosphor.phosphor.light.MusicNote
import top.notbe.phosphor.phosphor.light.MusicNoteSimple
import top.notbe.phosphor.phosphor.light.MusicNotes
import top.notbe.phosphor.phosphor.light.MusicNotesPlus
import top.notbe.phosphor.phosphor.light.MusicNotesSimple
import top.notbe.phosphor.phosphor.light.NavigationArrow
import top.notbe.phosphor.phosphor.light.Needle
import top.notbe.phosphor.phosphor.light.Newspaper
import top.notbe.phosphor.phosphor.light.NewspaperClipping
import top.notbe.phosphor.phosphor.light.Notches
import top.notbe.phosphor.phosphor.light.Note
import top.notbe.phosphor.phosphor.light.NoteBlank
import top.notbe.phosphor.phosphor.light.NotePencil
import top.notbe.phosphor.phosphor.light.Notebook
import top.notbe.phosphor.phosphor.light.Notepad
import top.notbe.phosphor.phosphor.light.Notification
import top.notbe.phosphor.phosphor.light.NotionLogo
import top.notbe.phosphor.phosphor.light.NumberCircleEight
import top.notbe.phosphor.phosphor.light.NumberCircleFive
import top.notbe.phosphor.phosphor.light.NumberCircleFour
import top.notbe.phosphor.phosphor.light.NumberCircleNine
import top.notbe.phosphor.phosphor.light.NumberCircleOne
import top.notbe.phosphor.phosphor.light.NumberCircleSeven
import top.notbe.phosphor.phosphor.light.NumberCircleSix
import top.notbe.phosphor.phosphor.light.NumberCircleThree
import top.notbe.phosphor.phosphor.light.NumberCircleTwo
import top.notbe.phosphor.phosphor.light.NumberCircleZero
import top.notbe.phosphor.phosphor.light.NumberEight
import top.notbe.phosphor.phosphor.light.NumberFive
import top.notbe.phosphor.phosphor.light.NumberFour
import top.notbe.phosphor.phosphor.light.NumberNine
import top.notbe.phosphor.phosphor.light.NumberOne
import top.notbe.phosphor.phosphor.light.NumberSeven
import top.notbe.phosphor.phosphor.light.NumberSix
import top.notbe.phosphor.phosphor.light.NumberSquareEight
import top.notbe.phosphor.phosphor.light.NumberSquareFive
import top.notbe.phosphor.phosphor.light.NumberSquareFour
import top.notbe.phosphor.phosphor.light.NumberSquareNine
import top.notbe.phosphor.phosphor.light.NumberSquareOne
import top.notbe.phosphor.phosphor.light.NumberSquareSeven
import top.notbe.phosphor.phosphor.light.NumberSquareSix
import top.notbe.phosphor.phosphor.light.NumberSquareThree
import top.notbe.phosphor.phosphor.light.NumberSquareTwo
import top.notbe.phosphor.phosphor.light.NumberSquareZero
import top.notbe.phosphor.phosphor.light.NumberThree
import top.notbe.phosphor.phosphor.light.NumberTwo
import top.notbe.phosphor.phosphor.light.NumberZero
import top.notbe.phosphor.phosphor.light.Nut
import top.notbe.phosphor.phosphor.light.NyTimesLogo
import top.notbe.phosphor.phosphor.light.Octagon
import top.notbe.phosphor.phosphor.light.OfficeChair
import top.notbe.phosphor.phosphor.light.Option
import top.notbe.phosphor.phosphor.light.OrangeSlice
import top.notbe.phosphor.phosphor.light.Package
import top.notbe.phosphor.phosphor.light.PaintBrush
import top.notbe.phosphor.phosphor.light.PaintBrushBroad
import top.notbe.phosphor.phosphor.light.PaintBrushHousehold
import top.notbe.phosphor.phosphor.light.PaintBucket
import top.notbe.phosphor.phosphor.light.PaintRoller
import top.notbe.phosphor.phosphor.light.Palette
import top.notbe.phosphor.phosphor.light.Pants
import top.notbe.phosphor.phosphor.light.PaperPlane
import top.notbe.phosphor.phosphor.light.PaperPlaneRight
import top.notbe.phosphor.phosphor.light.PaperPlaneTilt
import top.notbe.phosphor.phosphor.light.Paperclip
import top.notbe.phosphor.phosphor.light.PaperclipHorizontal
import top.notbe.phosphor.phosphor.light.Parachute
import top.notbe.phosphor.phosphor.light.Paragraph
import top.notbe.phosphor.phosphor.light.Parallelogram
import top.notbe.phosphor.phosphor.light.Park
import top.notbe.phosphor.phosphor.light.Password
import top.notbe.phosphor.phosphor.light.Path
import top.notbe.phosphor.phosphor.light.PatreonLogo
import top.notbe.phosphor.phosphor.light.Pause
import top.notbe.phosphor.phosphor.light.PauseCircle
import top.notbe.phosphor.phosphor.light.PawPrint
import top.notbe.phosphor.phosphor.light.PaypalLogo
import top.notbe.phosphor.phosphor.light.Peace
import top.notbe.phosphor.phosphor.light.Pen
import top.notbe.phosphor.phosphor.light.PenNib
import top.notbe.phosphor.phosphor.light.PenNibStraight
import top.notbe.phosphor.phosphor.light.Pencil
import top.notbe.phosphor.phosphor.light.PencilCircle
import top.notbe.phosphor.phosphor.light.PencilLine
import top.notbe.phosphor.phosphor.light.PencilSimple
import top.notbe.phosphor.phosphor.light.PencilSimpleLine
import top.notbe.phosphor.phosphor.light.PencilSimpleSlash
import top.notbe.phosphor.phosphor.light.PencilSlash
import top.notbe.phosphor.phosphor.light.Pentagram
import top.notbe.phosphor.phosphor.light.Pepper
import top.notbe.phosphor.phosphor.light.Percent
import top.notbe.phosphor.phosphor.light.Person
import top.notbe.phosphor.phosphor.light.PersonArmsSpread
import top.notbe.phosphor.phosphor.light.PersonSimple
import top.notbe.phosphor.phosphor.light.PersonSimpleBike
import top.notbe.phosphor.phosphor.light.PersonSimpleRun
import top.notbe.phosphor.phosphor.light.PersonSimpleThrow
import top.notbe.phosphor.phosphor.light.PersonSimpleWalk
import top.notbe.phosphor.phosphor.light.Perspective
import top.notbe.phosphor.phosphor.light.Phone
import top.notbe.phosphor.phosphor.light.PhoneCall
import top.notbe.phosphor.phosphor.light.PhoneDisconnect
import top.notbe.phosphor.phosphor.light.PhoneIncoming
import top.notbe.phosphor.phosphor.light.PhoneOutgoing
import top.notbe.phosphor.phosphor.light.PhonePlus
import top.notbe.phosphor.phosphor.light.PhoneSlash
import top.notbe.phosphor.phosphor.light.PhoneX
import top.notbe.phosphor.phosphor.light.PhosphorLogo
import top.notbe.phosphor.phosphor.light.Pi
import top.notbe.phosphor.phosphor.light.PianoKeys
import top.notbe.phosphor.phosphor.light.PictureInPicture
import top.notbe.phosphor.phosphor.light.PiggyBank
import top.notbe.phosphor.phosphor.light.Pill
import top.notbe.phosphor.phosphor.light.PinterestLogo
import top.notbe.phosphor.phosphor.light.Pinwheel
import top.notbe.phosphor.phosphor.light.Pizza
import top.notbe.phosphor.phosphor.light.Placeholder
import top.notbe.phosphor.phosphor.light.Planet
import top.notbe.phosphor.phosphor.light.Plant
import top.notbe.phosphor.phosphor.light.Play
import top.notbe.phosphor.phosphor.light.PlayCircle
import top.notbe.phosphor.phosphor.light.PlayPause
import top.notbe.phosphor.phosphor.light.Playlist
import top.notbe.phosphor.phosphor.light.Plug
import top.notbe.phosphor.phosphor.light.PlugCharging
import top.notbe.phosphor.phosphor.light.Plugs
import top.notbe.phosphor.phosphor.light.PlugsConnected
import top.notbe.phosphor.phosphor.light.Plus
import top.notbe.phosphor.phosphor.light.PlusCircle
import top.notbe.phosphor.phosphor.light.PlusMinus
import top.notbe.phosphor.phosphor.light.PlusSquare
import top.notbe.phosphor.phosphor.light.PokerChip
import top.notbe.phosphor.phosphor.light.PoliceCar
import top.notbe.phosphor.phosphor.light.Polygon
import top.notbe.phosphor.phosphor.light.Popcorn
import top.notbe.phosphor.phosphor.light.PottedPlant
import top.notbe.phosphor.phosphor.light.Power
import top.notbe.phosphor.phosphor.light.Prescription
import top.notbe.phosphor.phosphor.light.Presentation
import top.notbe.phosphor.phosphor.light.PresentationChart
import top.notbe.phosphor.phosphor.light.Printer
import top.notbe.phosphor.phosphor.light.Prohibit
import top.notbe.phosphor.phosphor.light.ProhibitInset
import top.notbe.phosphor.phosphor.light.ProjectorScreen
import top.notbe.phosphor.phosphor.light.ProjectorScreenChart
import top.notbe.phosphor.phosphor.light.Pulse
import top.notbe.phosphor.phosphor.light.PushPin
import top.notbe.phosphor.phosphor.light.PushPinSimple
import top.notbe.phosphor.phosphor.light.PushPinSimpleSlash
import top.notbe.phosphor.phosphor.light.PushPinSlash
import top.notbe.phosphor.phosphor.light.PuzzlePiece
import top.notbe.phosphor.phosphor.light.QrCode
import top.notbe.phosphor.phosphor.light.Question
import top.notbe.phosphor.phosphor.light.Queue
import top.notbe.phosphor.phosphor.light.Quotes
import top.notbe.phosphor.phosphor.light.Radical
import top.notbe.phosphor.phosphor.light.Radio
import top.notbe.phosphor.phosphor.light.RadioButton
import top.notbe.phosphor.phosphor.light.Radioactive
import top.notbe.phosphor.phosphor.light.Rainbow
import top.notbe.phosphor.phosphor.light.RainbowCloud
import top.notbe.phosphor.phosphor.light.ReadCvLogo
import top.notbe.phosphor.phosphor.light.Receipt
import top.notbe.phosphor.phosphor.light.ReceiptX
import top.notbe.phosphor.phosphor.light.Record
import top.notbe.phosphor.phosphor.light.Rectangle
import top.notbe.phosphor.phosphor.light.Recycle
import top.notbe.phosphor.phosphor.light.RedditLogo
import top.notbe.phosphor.phosphor.light.Repeat
import top.notbe.phosphor.phosphor.light.RepeatOnce
import top.notbe.phosphor.phosphor.light.Rewind
import top.notbe.phosphor.phosphor.light.RewindCircle
import top.notbe.phosphor.phosphor.light.RoadHorizon
import top.notbe.phosphor.phosphor.light.Robot
import top.notbe.phosphor.phosphor.light.Rocket
import top.notbe.phosphor.phosphor.light.RocketLaunch
import top.notbe.phosphor.phosphor.light.Rows
import top.notbe.phosphor.phosphor.light.Rss
import top.notbe.phosphor.phosphor.light.RssSimple
import top.notbe.phosphor.phosphor.light.Rug
import top.notbe.phosphor.phosphor.light.Ruler
import top.notbe.phosphor.phosphor.light.Scales
import top.notbe.phosphor.phosphor.light.Scan
import top.notbe.phosphor.phosphor.light.Scissors
import top.notbe.phosphor.phosphor.light.Scooter
import top.notbe.phosphor.phosphor.light.Screencast
import top.notbe.phosphor.phosphor.light.ScribbleLoop
import top.notbe.phosphor.phosphor.light.Scroll
import top.notbe.phosphor.phosphor.light.Seal
import top.notbe.phosphor.phosphor.light.SealCheck
import top.notbe.phosphor.phosphor.light.SealQuestion
import top.notbe.phosphor.phosphor.light.SealWarning
import top.notbe.phosphor.phosphor.light.Selection
import top.notbe.phosphor.phosphor.light.SelectionAll
import top.notbe.phosphor.phosphor.light.SelectionBackground
import top.notbe.phosphor.phosphor.light.SelectionForeground
import top.notbe.phosphor.phosphor.light.SelectionInverse
import top.notbe.phosphor.phosphor.light.SelectionPlus
import top.notbe.phosphor.phosphor.light.SelectionSlash
import top.notbe.phosphor.phosphor.light.Shapes
import top.notbe.phosphor.phosphor.light.Share
import top.notbe.phosphor.phosphor.light.ShareFat
import top.notbe.phosphor.phosphor.light.ShareNetwork
import top.notbe.phosphor.phosphor.light.Shield
import top.notbe.phosphor.phosphor.light.ShieldCheck
import top.notbe.phosphor.phosphor.light.ShieldCheckered
import top.notbe.phosphor.phosphor.light.ShieldChevron
import top.notbe.phosphor.phosphor.light.ShieldPlus
import top.notbe.phosphor.phosphor.light.ShieldSlash
import top.notbe.phosphor.phosphor.light.ShieldStar
import top.notbe.phosphor.phosphor.light.ShieldWarning
import top.notbe.phosphor.phosphor.light.ShirtFolded
import top.notbe.phosphor.phosphor.light.ShootingStar
import top.notbe.phosphor.phosphor.light.ShoppingBag
import top.notbe.phosphor.phosphor.light.ShoppingBagOpen
import top.notbe.phosphor.phosphor.light.ShoppingCart
import top.notbe.phosphor.phosphor.light.ShoppingCartSimple
import top.notbe.phosphor.phosphor.light.Shower
import top.notbe.phosphor.phosphor.light.Shrimp
import top.notbe.phosphor.phosphor.light.Shuffle
import top.notbe.phosphor.phosphor.light.ShuffleAngular
import top.notbe.phosphor.phosphor.light.ShuffleSimple
import top.notbe.phosphor.phosphor.light.Sidebar
import top.notbe.phosphor.phosphor.light.SidebarSimple
import top.notbe.phosphor.phosphor.light.Sigma
import top.notbe.phosphor.phosphor.light.SignIn
import top.notbe.phosphor.phosphor.light.SignOut
import top.notbe.phosphor.phosphor.light.Signature
import top.notbe.phosphor.phosphor.light.Signpost
import top.notbe.phosphor.phosphor.light.SimCard
import top.notbe.phosphor.phosphor.light.Siren
import top.notbe.phosphor.phosphor.light.SketchLogo
import top.notbe.phosphor.phosphor.light.SkipBack
import top.notbe.phosphor.phosphor.light.SkipBackCircle
import top.notbe.phosphor.phosphor.light.SkipForward
import top.notbe.phosphor.phosphor.light.SkipForwardCircle
import top.notbe.phosphor.phosphor.light.Skull
import top.notbe.phosphor.phosphor.light.SlackLogo
import top.notbe.phosphor.phosphor.light.Sliders
import top.notbe.phosphor.phosphor.light.SlidersHorizontal
import top.notbe.phosphor.phosphor.light.Slideshow
import top.notbe.phosphor.phosphor.light.Smiley
import top.notbe.phosphor.phosphor.light.SmileyAngry
import top.notbe.phosphor.phosphor.light.SmileyBlank
import top.notbe.phosphor.phosphor.light.SmileyMeh
import top.notbe.phosphor.phosphor.light.SmileyNervous
import top.notbe.phosphor.phosphor.light.SmileySad
import top.notbe.phosphor.phosphor.light.SmileySticker
import top.notbe.phosphor.phosphor.light.SmileyWink
import top.notbe.phosphor.phosphor.light.SmileyXEyes
import top.notbe.phosphor.phosphor.light.SnapchatLogo
import top.notbe.phosphor.phosphor.light.Sneaker
import top.notbe.phosphor.phosphor.light.SneakerMove
import top.notbe.phosphor.phosphor.light.Snowflake
import top.notbe.phosphor.phosphor.light.SoccerBall
import top.notbe.phosphor.phosphor.light.SortAscending
import top.notbe.phosphor.phosphor.light.SortDescending
import top.notbe.phosphor.phosphor.light.SoundcloudLogo
import top.notbe.phosphor.phosphor.light.Spade
import top.notbe.phosphor.phosphor.light.Sparkle
import top.notbe.phosphor.phosphor.light.SpeakerHifi
import top.notbe.phosphor.phosphor.light.SpeakerHigh
import top.notbe.phosphor.phosphor.light.SpeakerLow
import top.notbe.phosphor.phosphor.light.SpeakerNone
import top.notbe.phosphor.phosphor.light.SpeakerSimpleHigh
import top.notbe.phosphor.phosphor.light.SpeakerSimpleLow
import top.notbe.phosphor.phosphor.light.SpeakerSimpleNone
import top.notbe.phosphor.phosphor.light.SpeakerSimpleSlash
import top.notbe.phosphor.phosphor.light.SpeakerSimpleX
import top.notbe.phosphor.phosphor.light.SpeakerSlash
import top.notbe.phosphor.phosphor.light.SpeakerX
import top.notbe.phosphor.phosphor.light.Spinner
import top.notbe.phosphor.phosphor.light.SpinnerGap
import top.notbe.phosphor.phosphor.light.Spiral
import top.notbe.phosphor.phosphor.light.SplitHorizontal
import top.notbe.phosphor.phosphor.light.SplitVertical
import top.notbe.phosphor.phosphor.light.SpotifyLogo
import top.notbe.phosphor.phosphor.light.Square
import top.notbe.phosphor.phosphor.light.SquareHalf
import top.notbe.phosphor.phosphor.light.SquareHalfBottom
import top.notbe.phosphor.phosphor.light.SquareLogo
import top.notbe.phosphor.phosphor.light.SquareSplitHorizontal
import top.notbe.phosphor.phosphor.light.SquareSplitVertical
import top.notbe.phosphor.phosphor.light.SquaresFour
import top.notbe.phosphor.phosphor.light.Stack
import top.notbe.phosphor.phosphor.light.StackOverflowLogo
import top.notbe.phosphor.phosphor.light.StackSimple
import top.notbe.phosphor.phosphor.light.Stairs
import top.notbe.phosphor.phosphor.light.Stamp
import top.notbe.phosphor.phosphor.light.Star
import top.notbe.phosphor.phosphor.light.StarAndCrescent
import top.notbe.phosphor.phosphor.light.StarFour
import top.notbe.phosphor.phosphor.light.StarHalf
import top.notbe.phosphor.phosphor.light.StarOfDavid
import top.notbe.phosphor.phosphor.light.SteeringWheel
import top.notbe.phosphor.phosphor.light.Steps
import top.notbe.phosphor.phosphor.light.Stethoscope
import top.notbe.phosphor.phosphor.light.Sticker
import top.notbe.phosphor.phosphor.light.Stool
import top.notbe.phosphor.phosphor.light.Stop
import top.notbe.phosphor.phosphor.light.StopCircle
import top.notbe.phosphor.phosphor.light.Storefront
import top.notbe.phosphor.phosphor.light.Strategy
import top.notbe.phosphor.phosphor.light.StripeLogo
import top.notbe.phosphor.phosphor.light.Student
import top.notbe.phosphor.phosphor.light.Subtitles
import top.notbe.phosphor.phosphor.light.Subtract
import top.notbe.phosphor.phosphor.light.SubtractSquare
import top.notbe.phosphor.phosphor.light.Suitcase
import top.notbe.phosphor.phosphor.light.SuitcaseRolling
import top.notbe.phosphor.phosphor.light.SuitcaseSimple
import top.notbe.phosphor.phosphor.light.Sun
import top.notbe.phosphor.phosphor.light.SunDim
import top.notbe.phosphor.phosphor.light.SunHorizon
import top.notbe.phosphor.phosphor.light.Sunglasses
import top.notbe.phosphor.phosphor.light.Swap
import top.notbe.phosphor.phosphor.light.Swatches
import top.notbe.phosphor.phosphor.light.SwimmingPool
import top.notbe.phosphor.phosphor.light.Sword
import top.notbe.phosphor.phosphor.light.Synagogue
import top.notbe.phosphor.phosphor.light.Syringe
import top.notbe.phosphor.phosphor.light.TShirt
import top.notbe.phosphor.phosphor.light.Table
import top.notbe.phosphor.phosphor.light.Tabs
import top.notbe.phosphor.phosphor.light.Tag
import top.notbe.phosphor.phosphor.light.TagChevron
import top.notbe.phosphor.phosphor.light.TagSimple
import top.notbe.phosphor.phosphor.light.Target
import top.notbe.phosphor.phosphor.light.Taxi
import top.notbe.phosphor.phosphor.light.TelegramLogo
import top.notbe.phosphor.phosphor.light.Television
import top.notbe.phosphor.phosphor.light.TelevisionSimple
import top.notbe.phosphor.phosphor.light.TennisBall
import top.notbe.phosphor.phosphor.light.Tent
import top.notbe.phosphor.phosphor.light.Terminal
import top.notbe.phosphor.phosphor.light.TerminalWindow
import top.notbe.phosphor.phosphor.light.TestTube
import top.notbe.phosphor.phosphor.light.TextAUnderline
import top.notbe.phosphor.phosphor.light.TextAa
import top.notbe.phosphor.phosphor.light.TextAlignCenter
import top.notbe.phosphor.phosphor.light.TextAlignJustify
import top.notbe.phosphor.phosphor.light.TextAlignLeft
import top.notbe.phosphor.phosphor.light.TextAlignRight
import top.notbe.phosphor.phosphor.light.TextB
import top.notbe.phosphor.phosphor.light.TextColumns
import top.notbe.phosphor.phosphor.light.TextH
import top.notbe.phosphor.phosphor.light.TextHFive
import top.notbe.phosphor.phosphor.light.TextHFour
import top.notbe.phosphor.phosphor.light.TextHOne
import top.notbe.phosphor.phosphor.light.TextHSix
import top.notbe.phosphor.phosphor.light.TextHThree
import top.notbe.phosphor.phosphor.light.TextHTwo
import top.notbe.phosphor.phosphor.light.TextIndent
import top.notbe.phosphor.phosphor.light.TextItalic
import top.notbe.phosphor.phosphor.light.TextOutdent
import top.notbe.phosphor.phosphor.light.TextStrikethrough
import top.notbe.phosphor.phosphor.light.TextT
import top.notbe.phosphor.phosphor.light.TextUnderline
import top.notbe.phosphor.phosphor.light.Textbox
import top.notbe.phosphor.phosphor.light.Thermometer
import top.notbe.phosphor.phosphor.light.ThermometerCold
import top.notbe.phosphor.phosphor.light.ThermometerHot
import top.notbe.phosphor.phosphor.light.ThermometerSimple
import top.notbe.phosphor.phosphor.light.ThumbsDown
import top.notbe.phosphor.phosphor.light.ThumbsUp
import top.notbe.phosphor.phosphor.light.Ticket
import top.notbe.phosphor.phosphor.light.TidalLogo
import top.notbe.phosphor.phosphor.light.TiktokLogo
import top.notbe.phosphor.phosphor.light.Timer
import top.notbe.phosphor.phosphor.light.Tipi
import top.notbe.phosphor.phosphor.light.ToggleLeft
import top.notbe.phosphor.phosphor.light.ToggleRight
import top.notbe.phosphor.phosphor.light.Toilet
import top.notbe.phosphor.phosphor.light.ToiletPaper
import top.notbe.phosphor.phosphor.light.Toolbox
import top.notbe.phosphor.phosphor.light.Tooth
import top.notbe.phosphor.phosphor.light.Tote
import top.notbe.phosphor.phosphor.light.ToteSimple
import top.notbe.phosphor.phosphor.light.Trademark
import top.notbe.phosphor.phosphor.light.TrademarkRegistered
import top.notbe.phosphor.phosphor.light.TrafficCone
import top.notbe.phosphor.phosphor.light.TrafficSign
import top.notbe.phosphor.phosphor.light.TrafficSignal
import top.notbe.phosphor.phosphor.light.Train
import top.notbe.phosphor.phosphor.light.TrainRegional
import top.notbe.phosphor.phosphor.light.TrainSimple
import top.notbe.phosphor.phosphor.light.Tram
import top.notbe.phosphor.phosphor.light.Translate
import top.notbe.phosphor.phosphor.light.Trash
import top.notbe.phosphor.phosphor.light.TrashSimple
import top.notbe.phosphor.phosphor.light.Tray
import top.notbe.phosphor.phosphor.light.Tree
import top.notbe.phosphor.phosphor.light.TreeEvergreen
import top.notbe.phosphor.phosphor.light.TreePalm
import top.notbe.phosphor.phosphor.light.TreeStructure
import top.notbe.phosphor.phosphor.light.TrendDown
import top.notbe.phosphor.phosphor.light.TrendUp
import top.notbe.phosphor.phosphor.light.Triangle
import top.notbe.phosphor.phosphor.light.Trophy
import top.notbe.phosphor.phosphor.light.Truck
import top.notbe.phosphor.phosphor.light.TwitchLogo
import top.notbe.phosphor.phosphor.light.TwitterLogo
import top.notbe.phosphor.phosphor.light.Umbrella
import top.notbe.phosphor.phosphor.light.UmbrellaSimple
import top.notbe.phosphor.phosphor.light.Unite
import top.notbe.phosphor.phosphor.light.UniteSquare
import top.notbe.phosphor.phosphor.light.Upload
import top.notbe.phosphor.phosphor.light.UploadSimple
import top.notbe.phosphor.phosphor.light.Usb
import top.notbe.phosphor.phosphor.light.User
import top.notbe.phosphor.phosphor.light.UserCircle
import top.notbe.phosphor.phosphor.light.UserCircleGear
import top.notbe.phosphor.phosphor.light.UserCircleMinus
import top.notbe.phosphor.phosphor.light.UserCirclePlus
import top.notbe.phosphor.phosphor.light.UserFocus
import top.notbe.phosphor.phosphor.light.UserGear
import top.notbe.phosphor.phosphor.light.UserList
import top.notbe.phosphor.phosphor.light.UserMinus
import top.notbe.phosphor.phosphor.light.UserPlus
import top.notbe.phosphor.phosphor.light.UserRectangle
import top.notbe.phosphor.phosphor.light.UserSquare
import top.notbe.phosphor.phosphor.light.UserSwitch
import top.notbe.phosphor.phosphor.light.Users
import top.notbe.phosphor.phosphor.light.UsersFour
import top.notbe.phosphor.phosphor.light.UsersThree
import top.notbe.phosphor.phosphor.light.Van
import top.notbe.phosphor.phosphor.light.Vault
import top.notbe.phosphor.phosphor.light.Vibrate
import top.notbe.phosphor.phosphor.light.Video
import top.notbe.phosphor.phosphor.light.VideoCamera
import top.notbe.phosphor.phosphor.light.VideoCameraSlash
import top.notbe.phosphor.phosphor.light.Vignette
import top.notbe.phosphor.phosphor.light.VinylRecord
import top.notbe.phosphor.phosphor.light.VirtualReality
import top.notbe.phosphor.phosphor.light.Virus
import top.notbe.phosphor.phosphor.light.Voicemail
import top.notbe.phosphor.phosphor.light.Volleyball
import top.notbe.phosphor.phosphor.light.Wall
import top.notbe.phosphor.phosphor.light.Wallet
import top.notbe.phosphor.phosphor.light.Warehouse
import top.notbe.phosphor.phosphor.light.Warning
import top.notbe.phosphor.phosphor.light.WarningCircle
import top.notbe.phosphor.phosphor.light.WarningDiamond
import top.notbe.phosphor.phosphor.light.WarningOctagon
import top.notbe.phosphor.phosphor.light.Watch
import top.notbe.phosphor.phosphor.light.WaveSawtooth
import top.notbe.phosphor.phosphor.light.WaveSine
import top.notbe.phosphor.phosphor.light.WaveSquare
import top.notbe.phosphor.phosphor.light.WaveTriangle
import top.notbe.phosphor.phosphor.light.Waveform
import top.notbe.phosphor.phosphor.light.Waves
import top.notbe.phosphor.phosphor.light.Webcam
import top.notbe.phosphor.phosphor.light.WebcamSlash
import top.notbe.phosphor.phosphor.light.WebhooksLogo
import top.notbe.phosphor.phosphor.light.WechatLogo
import top.notbe.phosphor.phosphor.light.WhatsappLogo
import top.notbe.phosphor.phosphor.light.Wheelchair
import top.notbe.phosphor.phosphor.light.WheelchairMotion
import top.notbe.phosphor.phosphor.light.WifiHigh
import top.notbe.phosphor.phosphor.light.WifiLow
import top.notbe.phosphor.phosphor.light.WifiMedium
import top.notbe.phosphor.phosphor.light.WifiNone
import top.notbe.phosphor.phosphor.light.WifiSlash
import top.notbe.phosphor.phosphor.light.WifiX
import top.notbe.phosphor.phosphor.light.Wind
import top.notbe.phosphor.phosphor.light.WindowsLogo
import top.notbe.phosphor.phosphor.light.Wine
import top.notbe.phosphor.phosphor.light.Wrench
import top.notbe.phosphor.phosphor.light.X
import top.notbe.phosphor.phosphor.light.XCircle
import top.notbe.phosphor.phosphor.light.XSquare
import top.notbe.phosphor.phosphor.light.YinYang
import top.notbe.phosphor.phosphor.light.YoutubeLogo
import kotlin.collections.List as ____KtList

public object LightGroup

public val Phosphor.Light: LightGroup
  get() = LightGroup

private var __All: ____KtList<ImageVector>? = null

public val LightGroup.All: ____KtList<ImageVector>
  get() {
    if (__All != null) {
      return __All!!
    }
    __All= listOf(AddressBook, Airplane, AirplaneInFlight, AirplaneLanding, AirplaneTakeoff,
        AirplaneTilt, Airplay, AirTrafficControl, Alarm, Alien, AlignBottom, AlignBottomSimple,
        AlignCenterHorizontal, AlignCenterHorizontalSimple, AlignCenterVertical,
        AlignCenterVerticalSimple, AlignLeft, AlignLeftSimple, AlignRight, AlignRightSimple,
        AlignTop, AlignTopSimple, AmazonLogo, Anchor, AnchorSimple, AndroidLogo, AngularLogo,
        Aperture, AppleLogo, ApplePodcastsLogo, AppStoreLogo, AppWindow, Archive, ArchiveBox,
        ArchiveTray, Armchair, ArrowsClockwise, ArrowsCounterClockwise, ArrowsDownUp,
        ArrowsHorizontal, ArrowsIn, ArrowsInCardinal, ArrowsInLineHorizontal, ArrowsInLineVertical,
        ArrowsInSimple, ArrowsLeftRight, ArrowsMerge, ArrowsOut, ArrowsOutCardinal,
        ArrowsOutLineHorizontal, ArrowsOutLineVertical, ArrowsOutSimple, ArrowsSplit,
        ArrowsVertical, ArrowArcLeft, ArrowArcRight, ArrowBendDoubleUpLeft, ArrowBendDoubleUpRight,
        ArrowBendDownLeft, ArrowBendDownRight, ArrowBendLeftDown, ArrowBendLeftUp,
        ArrowBendRightDown, ArrowBendRightUp, ArrowBendUpLeft, ArrowBendUpRight, ArrowCircleDown,
        ArrowCircleDownLeft, ArrowCircleDownRight, ArrowCircleLeft, ArrowCircleRight, ArrowCircleUp,
        ArrowCircleUpLeft, ArrowCircleUpRight, ArrowClockwise, ArrowCounterClockwise, ArrowDown,
        ArrowDownLeft, ArrowDownRight, ArrowElbowDownLeft, ArrowElbowDownRight, ArrowElbowLeft,
        ArrowElbowLeftDown, ArrowElbowLeftUp, ArrowElbowRight, ArrowElbowRightDown,
        ArrowElbowRightUp, ArrowElbowUpLeft, ArrowElbowUpRight, ArrowFatDown, ArrowFatLeft,
        ArrowFatLinesDown, ArrowFatLinesLeft, ArrowFatLinesRight, ArrowFatLinesUp, ArrowFatLineDown,
        ArrowFatLineLeft, ArrowFatLineRight, ArrowFatLineUp, ArrowFatRight, ArrowFatUp, ArrowLeft,
        ArrowLineDown, ArrowLineDownLeft, ArrowLineDownRight, ArrowLineLeft, ArrowLineRight,
        ArrowLineUp, ArrowLineUpLeft, ArrowLineUpRight, ArrowRight, ArrowSquareDown,
        ArrowSquareDownLeft, ArrowSquareDownRight, ArrowSquareIn, ArrowSquareLeft, ArrowSquareOut,
        ArrowSquareRight, ArrowSquareUp, ArrowSquareUpLeft, ArrowSquareUpRight, ArrowUp,
        ArrowUpLeft, ArrowUpRight, ArrowUDownLeft, ArrowUDownRight, ArrowULeftDown, ArrowULeftUp,
        ArrowURightDown, ArrowURightUp, ArrowUUpLeft, ArrowUUpRight, Article, ArticleMedium,
        ArticleNyTimes, Asterisk, AsteriskSimple, At, Atom, Baby, Backpack, Backspace, Bag,
        BagSimple, Balloon, Bandaids, Bank, Barbell, Barcode, Barricade, Baseball, BaseballCap,
        Basket, Basketball, Bathtub, BatteryCharging, BatteryChargingVertical, BatteryEmpty,
        BatteryFull, BatteryHigh, BatteryLow, BatteryMedium, BatteryPlus, BatteryPlusVertical,
        BatteryVerticalEmpty, BatteryVerticalFull, BatteryVerticalHigh, BatteryVerticalLow,
        BatteryVerticalMedium, BatteryWarning, BatteryWarningVertical, Bed, BeerBottle, BeerStein,
        BehanceLogo, Bell, BellRinging, BellSimple, BellSimpleRinging, BellSimpleSlash, BellSimpleZ,
        BellSlash, BellZ, BezierCurve, Bicycle, Binoculars, Bird, Bluetooth, BluetoothConnected,
        BluetoothSlash, BluetoothX, Boat, Bone, Book, Bookmark, Bookmarks, BookmarksSimple,
        BookmarkSimple, Books, BookBookmark, BookOpen, BookOpenText, Boot, BoundingBox, BowlFood,
        BracketsAngle, BracketsCurly, BracketsRound, BracketsSquare, Brain, Brandy, Bridge,
        Briefcase, BriefcaseMetal, Broadcast, Broom, Browser, Browsers, Bug, BugBeetle, BugDroid,
        Buildings, Bus, Butterfly, Cactus, Cake, Calculator, Calendar, CalendarBlank, CalendarCheck,
        CalendarPlus, CalendarX, CallBell, Camera, CameraPlus, CameraRotate, CameraSlash, Campfire,
        Car, Cardholder, Cards, CaretCircleDoubleDown, CaretCircleDoubleLeft,
        CaretCircleDoubleRight, CaretCircleDoubleUp, CaretCircleDown, CaretCircleLeft,
        CaretCircleRight, CaretCircleUp, CaretCircleUpDown, CaretDoubleDown, CaretDoubleLeft,
        CaretDoubleRight, CaretDoubleUp, CaretDown, CaretLeft, CaretRight, CaretUp, CaretUpDown,
        Carrot, CarProfile, CarSimple, CassetteTape, CastleTurret, Cat, CellSignalFull,
        CellSignalHigh, CellSignalLow, CellSignalMedium, CellSignalNone, CellSignalSlash,
        CellSignalX, Certificate, Chair, Chalkboard, ChalkboardSimple, ChalkboardTeacher, Champagne,
        ChargingStation, ChartBar, ChartBarHorizontal, ChartDonut, ChartLine, ChartLineDown,
        ChartLineUp, ChartPie, ChartPieSlice, ChartPolar, ChartScatter, Chat, Chats, ChatsCircle,
        ChatsTeardrop, ChatCentered, ChatCenteredDots, ChatCenteredText, ChatCircle, ChatCircleDots,
        ChatCircleText, ChatDots, ChatTeardrop, ChatTeardropDots, ChatTeardropText, ChatText, Check,
        Checks, CheckCircle, CheckFat, CheckSquare, CheckSquareOffset, Church, Circle, CirclesFour,
        CirclesThree, CirclesThreePlus, CircleDashed, CircleHalf, CircleHalfTilt, CircleNotch,
        Circuitry, Clipboard, ClipboardText, Clock, ClockAfternoon, ClockClockwise, ClockCountdown,
        ClockCounterClockwise, ClosedCaptioning, Cloud, CloudArrowDown, CloudArrowUp, CloudCheck,
        CloudFog, CloudLightning, CloudMoon, CloudRain, CloudSlash, CloudSnow, CloudSun,
        CloudWarning, CloudX, Club, CoatHanger, CodaLogo, Code, CodepenLogo, CodesandboxLogo,
        CodeBlock, CodeSimple, Coffee, Coin, Coins, CoinVertical, Columns, Command, Compass,
        CompassTool, ComputerTower, Confetti, ContactlessPayment, Control, Cookie, CookingPot, Copy,
        Copyleft, Copyright, CopySimple, CornersIn, CornersOut, Couch, Cpu, CreditCard, Crop, Cross,
        Crosshair, CrosshairSimple, Crown, CrownSimple, Cube, CubeFocus, CubeTransparent,
        CurrencyBtc, CurrencyCircleDollar, CurrencyCny, CurrencyDollar, CurrencyDollarSimple,
        CurrencyEth, CurrencyEur, CurrencyGbp, CurrencyInr, CurrencyJpy, CurrencyKrw, CurrencyKzt,
        CurrencyNgn, CurrencyRub, Cursor, CursorClick, CursorText, Cylinder, Database, Desktop,
        DesktopTower, Detective, Devices, DeviceMobile, DeviceMobileCamera, DeviceMobileSpeaker,
        DeviceTablet, DeviceTabletCamera, DeviceTabletSpeaker, DevToLogo, Diamond, DiamondsFour,
        DiceFive, DiceFour, DiceOne, DiceSix, DiceThree, DiceTwo, Disc, DiscordLogo, Divide, Dna,
        Dog, Door, DoorOpen, Dot, DotsNine, DotsSix, DotsSixVertical, DotsThree, DotsThreeCircle,
        DotsThreeCircleVertical, DotsThreeOutline, DotsThreeOutlineVertical, DotsThreeVertical,
        DotOutline, Download, DownloadSimple, Dress, DribbbleLogo, Drop, DropboxLogo, DropHalf,
        DropHalfBottom, Ear, EarSlash, Egg, EggCrack, Eject, EjectSimple, Elevator, Engine,
        Envelope, EnvelopeOpen, EnvelopeSimple, EnvelopeSimpleOpen, Equalizer, Equals, Eraser,
        EscalatorDown, EscalatorUp, Exam, Exclude, ExcludeSquare, Export, Eye, Eyedropper,
        EyedropperSample, Eyeglasses, EyeClosed, EyeSlash, FacebookLogo, FaceMask, Factory, Faders,
        FadersHorizontal, Fan, FastForward, FastForwardCircle, Feather, FigmaLogo, File, Files,
        FileArchive, FileArrowDown, FileArrowUp, FileAudio, FileCloud, FileCode, FileCss, FileCsv,
        FileDashed, FileDoc, FileHtml, FileImage, FileJpg, FileJs, FileJsx, FileLock,
        FileMagnifyingGlass, FileMinus, FilePdf, FilePlus, FilePng, FilePpt, FileRs, FileSql,
        FileSvg, FileText, FileTs, FileTsx, FileVideo, FileVue, FileX, FileXls, FileZip, FilmReel,
        FilmScript, FilmSlate, FilmStrip, Fingerprint, FingerprintSimple, FinnTheHuman, Fire,
        FireExtinguisher, FireSimple, FirstAid, FirstAidKit, Fish, FishSimple, Flag, FlagBanner,
        FlagCheckered, FlagPennant, Flame, Flashlight, Flask, FloppyDisk, FloppyDiskBack, Flower,
        FlowerLotus, FlowerTulip, FlowArrow, FlyingSaucer, Folder, Folders, FolderDashed,
        FolderLock, FolderMinus, FolderNotch, FolderNotchMinus, FolderNotchOpen, FolderNotchPlus,
        FolderOpen, FolderPlus, FolderSimple, FolderSimpleDashed, FolderSimpleLock,
        FolderSimpleMinus, FolderSimplePlus, FolderSimpleStar, FolderSimpleUser, FolderStar,
        FolderUser, Football, Footprints, ForkKnife, FramerLogo, FrameCorners, Function, Funnel,
        FunnelSimple, GameController, Garage, GasCan, GasPump, Gauge, Gavel, Gear, GearFine,
        GearSix, GenderFemale, GenderIntersex, GenderMale, GenderNeuter, GenderNonbinary,
        GenderTransgender, Ghost, Gif, Gift, GithubLogo, GitlabLogo, GitlabLogoSimple, GitBranch,
        GitCommit, GitDiff, GitFork, GitMerge, GitPullRequest, Globe, GlobeHemisphereEast,
        GlobeHemisphereWest, GlobeSimple, GlobeStand, Goggles, GoodreadsLogo, GoogleCardboardLogo,
        GoogleChromeLogo, GoogleDriveLogo, GoogleLogo, GooglePhotosLogo, GooglePlayLogo,
        GooglePodcastsLogo, Gradient, GraduationCap, Grains, GrainsSlash, Graph, GridFour, GridNine,
        Guitar, Hamburger, Hammer, Hand, Handbag, HandbagSimple, Handshake, HandsClapping,
        HandsPraying, HandCoins, HandEye, HandFist, HandGrabbing, HandHeart, HandPalm, HandPointing,
        HandSoap, HandSwipeLeft, HandSwipeRight, HandTap, HandWaving, HardDrive, HardDrives, Hash,
        HashStraight, Headlights, Headphones, Headset, Heart, Heartbeat, HeartBreak, HeartHalf,
        HeartStraight, HeartStraightBreak, Hexagon, HighlighterCircle, HighHeel, Hoodie, Horse,
        Hourglass, HourglassHigh, HourglassLow, HourglassMedium, HourglassSimple,
        HourglassSimpleHigh, HourglassSimpleLow, HourglassSimpleMedium, House, HouseLine,
        HouseSimple, IceCream, IdentificationBadge, IdentificationCard, Image, Images, ImagesSquare,
        ImageSquare, Infinity, Info, InstagramLogo, Intersect, IntersectSquare, IntersectThree,
        Jeep, Kanban, Key, Keyboard, Keyhole, KeyReturn, Knife, Ladder, LadderSimple, Lamp, Laptop,
        Layout, Leaf, Lifebuoy, Lightbulb, LightbulbFilament, Lighthouse, Lightning, LightningA,
        LightningSlash, LineSegment, LineSegments, Link, LinkedinLogo, LinkBreak, LinkSimple,
        LinkSimpleBreak, LinkSimpleHorizontal, LinkSimpleHorizontalBreak, LinuxLogo, List,
        ListBullets, ListChecks, ListDashes, ListMagnifyingGlass, ListNumbers, ListPlus, Lock,
        Lockers, LockKey, LockKeyOpen, LockLaminated, LockLaminatedOpen, LockOpen, LockSimple,
        LockSimpleOpen, MagicWand, Magnet, MagnetStraight, MagnifyingGlass, MagnifyingGlassMinus,
        MagnifyingGlassPlus, MapPin, MapPinLine, MapTrifold, MarkerCircle, Martini, MaskHappy,
        MaskSad, MathOperations, Medal, MedalMilitary, MediumLogo, Megaphone, MegaphoneSimple,
        MessengerLogo, MetaLogo, Metronome, Microphone, MicrophoneSlash, MicrophoneStage,
        MicrosoftExcelLogo, MicrosoftOutlookLogo, MicrosoftPowerpointLogo, MicrosoftTeamsLogo,
        MicrosoftWordLogo, Minus, MinusCircle, MinusSquare, Money, Monitor, MonitorPlay, Moon,
        MoonStars, Moped, MopedFront, Mosque, Motorcycle, Mountains, Mouse, MouseSimple, MusicNote,
        MusicNotes, MusicNotesPlus, MusicNotesSimple, MusicNoteSimple, NavigationArrow, Needle,
        Newspaper, NewspaperClipping, Notches, Note, Notebook, Notepad, NoteBlank, NotePencil,
        Notification, NotionLogo, NumberCircleEight, NumberCircleFive, NumberCircleFour,
        NumberCircleNine, NumberCircleOne, NumberCircleSeven, NumberCircleSix, NumberCircleThree,
        NumberCircleTwo, NumberCircleZero, NumberEight, NumberFive, NumberFour, NumberNine,
        NumberOne, NumberSeven, NumberSix, NumberSquareEight, NumberSquareFive, NumberSquareFour,
        NumberSquareNine, NumberSquareOne, NumberSquareSeven, NumberSquareSix, NumberSquareThree,
        NumberSquareTwo, NumberSquareZero, NumberThree, NumberTwo, NumberZero, Nut, NyTimesLogo,
        Octagon, OfficeChair, Option, OrangeSlice, Package, PaintBrush, PaintBrushBroad,
        PaintBrushHousehold, PaintBucket, PaintRoller, Palette, Pants, Paperclip,
        PaperclipHorizontal, PaperPlane, PaperPlaneRight, PaperPlaneTilt, Parachute, Paragraph,
        Parallelogram, Park, Password, Path, PatreonLogo, Pause, PauseCircle, PawPrint, PaypalLogo,
        Peace, Pen, Pencil, PencilCircle, PencilLine, PencilSimple, PencilSimpleLine,
        PencilSimpleSlash, PencilSlash, Pentagram, PenNib, PenNibStraight, Pepper, Percent, Person,
        PersonArmsSpread, PersonSimple, PersonSimpleBike, PersonSimpleRun, PersonSimpleThrow,
        PersonSimpleWalk, Perspective, Phone, PhoneCall, PhoneDisconnect, PhoneIncoming,
        PhoneOutgoing, PhonePlus, PhoneSlash, PhoneX, PhosphorLogo, Pi, PianoKeys, PictureInPicture,
        PiggyBank, Pill, PinterestLogo, Pinwheel, Pizza, Placeholder, Planet, Plant, Play, Playlist,
        PlayCircle, PlayPause, Plug, Plugs, PlugsConnected, PlugCharging, Plus, PlusCircle,
        PlusMinus, PlusSquare, PokerChip, PoliceCar, Polygon, Popcorn, PottedPlant, Power,
        Prescription, Presentation, PresentationChart, Printer, Prohibit, ProhibitInset,
        ProjectorScreen, ProjectorScreenChart, Pulse, PushPin, PushPinSimple, PushPinSimpleSlash,
        PushPinSlash, PuzzlePiece, QrCode, Question, Queue, Quotes, Radical, Radio, Radioactive,
        RadioButton, Rainbow, RainbowCloud, ReadCvLogo, Receipt, ReceiptX, Record, Rectangle,
        Recycle, RedditLogo, Repeat, RepeatOnce, Rewind, RewindCircle, RoadHorizon, Robot, Rocket,
        RocketLaunch, Rows, Rss, RssSimple, Rug, Ruler, Scales, Scan, Scissors, Scooter, Screencast,
        ScribbleLoop, Scroll, Seal, SealCheck, SealQuestion, SealWarning, Selection, SelectionAll,
        SelectionBackground, SelectionForeground, SelectionInverse, SelectionPlus, SelectionSlash,
        Shapes, Share, ShareFat, ShareNetwork, Shield, ShieldCheck, ShieldCheckered, ShieldChevron,
        ShieldPlus, ShieldSlash, ShieldStar, ShieldWarning, ShirtFolded, ShootingStar, ShoppingBag,
        ShoppingBagOpen, ShoppingCart, ShoppingCartSimple, Shower, Shrimp, Shuffle, ShuffleAngular,
        ShuffleSimple, Sidebar, SidebarSimple, Sigma, Signature, Signpost, SignIn, SignOut, SimCard,
        Siren, SketchLogo, SkipBack, SkipBackCircle, SkipForward, SkipForwardCircle, Skull,
        SlackLogo, Sliders, SlidersHorizontal, Slideshow, Smiley, SmileyAngry, SmileyBlank,
        SmileyMeh, SmileyNervous, SmileySad, SmileySticker, SmileyWink, SmileyXEyes, SnapchatLogo,
        Sneaker, SneakerMove, Snowflake, SoccerBall, SortAscending, SortDescending, SoundcloudLogo,
        Spade, Sparkle, SpeakerHifi, SpeakerHigh, SpeakerLow, SpeakerNone, SpeakerSimpleHigh,
        SpeakerSimpleLow, SpeakerSimpleNone, SpeakerSimpleSlash, SpeakerSimpleX, SpeakerSlash,
        SpeakerX, Spinner, SpinnerGap, Spiral, SplitHorizontal, SplitVertical, SpotifyLogo, Square,
        SquaresFour, SquareHalf, SquareHalfBottom, SquareLogo, SquareSplitHorizontal,
        SquareSplitVertical, Stack, StackOverflowLogo, StackSimple, Stairs, Stamp, Star,
        StarAndCrescent, StarFour, StarHalf, StarOfDavid, SteeringWheel, Steps, Stethoscope,
        Sticker, Stool, Stop, StopCircle, Storefront, Strategy, StripeLogo, Student, Subtitles,
        Subtract, SubtractSquare, Suitcase, SuitcaseRolling, SuitcaseSimple, Sun, Sunglasses,
        SunDim, SunHorizon, Swap, Swatches, SwimmingPool, Sword, Synagogue, Syringe, Table, Tabs,
        Tag, TagChevron, TagSimple, Target, Taxi, TelegramLogo, Television, TelevisionSimple,
        TennisBall, Tent, Terminal, TerminalWindow, TestTube, Textbox, TextAa, TextAlignCenter,
        TextAlignJustify, TextAlignLeft, TextAlignRight, TextAUnderline, TextB, TextColumns, TextH,
        TextHFive, TextHFour, TextHOne, TextHSix, TextHThree, TextHTwo, TextIndent, TextItalic,
        TextOutdent, TextStrikethrough, TextT, TextUnderline, Thermometer, ThermometerCold,
        ThermometerHot, ThermometerSimple, ThumbsDown, ThumbsUp, Ticket, TidalLogo, TiktokLogo,
        Timer, Tipi, ToggleLeft, ToggleRight, Toilet, ToiletPaper, Toolbox, Tooth, Tote, ToteSimple,
        Trademark, TrademarkRegistered, TrafficCone, TrafficSign, TrafficSignal, Train,
        TrainRegional, TrainSimple, Tram, Translate, Trash, TrashSimple, Tray, Tree, TreeEvergreen,
        TreePalm, TreeStructure, TrendDown, TrendUp, Triangle, Trophy, Truck, TwitchLogo,
        TwitterLogo, TShirt, Umbrella, UmbrellaSimple, Unite, UniteSquare, Upload, UploadSimple,
        Usb, User, Users, UsersFour, UsersThree, UserCircle, UserCircleGear, UserCircleMinus,
        UserCirclePlus, UserFocus, UserGear, UserList, UserMinus, UserPlus, UserRectangle,
        UserSquare, UserSwitch, Van, Vault, Vibrate, Video, VideoCamera, VideoCameraSlash, Vignette,
        VinylRecord, VirtualReality, Virus, Voicemail, Volleyball, Wall, Wallet, Warehouse, Warning,
        WarningCircle, WarningDiamond, WarningOctagon, Watch, Waveform, Waves, WaveSawtooth,
        WaveSine, WaveSquare, WaveTriangle, Webcam, WebcamSlash, WebhooksLogo, WechatLogo,
        WhatsappLogo, Wheelchair, WheelchairMotion, WifiHigh, WifiLow, WifiMedium, WifiNone,
        WifiSlash, WifiX, Wind, WindowsLogo, Wine, Wrench, X, XCircle, XSquare, YinYang,
        YoutubeLogo)
    return __All!!
  }
